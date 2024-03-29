package HomeWork_OOP_02;

import java.util.ArrayList;

public class GeoTree {
    SaveFiles saveFiles = new PrinterImple();
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
//        saveFiles.saveFile(String.valueOf(tree.add(new Node(children, Relationship.children, parent))));
//        saveFiles.saveFile(String.valueOf(tree.add(new Node(parent, Relationship.parent, children))));
    }

    // связь муж - жена
    public void appendVifeHusbent(Person vife, Person husbent) {
        tree.add(new Node(vife, Relationship.vife, husbent));
        tree.add(new Node(husbent, Relationship.husbent, vife));
    }

}


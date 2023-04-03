package HomeWork_OOP_01;

import java.util.ArrayList;

public class GeoTree01 {

    private ArrayList<Node01> tree = new ArrayList<>();

    public ArrayList<Node01> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendPerentChild(Person01 parent, Person01 children) {
        tree.add(new Node01(parent, Relationship01.parent, children));
        tree.add(new Node01(children, Relationship01.children, parent));
    }

    // связь муж - жена
    public void appendVifeHusbent(Person01 vife, Person01 husbent) {
        tree.add(new Node01(vife, Relationship01.vife, husbent));
        tree.add(new Node01(husbent, Relationship01.husbent, vife));
    }

}

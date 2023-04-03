package HomeWork_OOP_01;

public class Node01 {
    public Node01(Person01 p1, Relationship01 re, Person01 p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Person01 p1;
    Relationship01 re;
    Person01 p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }

}

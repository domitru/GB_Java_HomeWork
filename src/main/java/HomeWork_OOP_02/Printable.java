package HomeWork_OOP_02;

import java.util.ArrayList;

public abstract class Printable {
    void print(String string) {
        System.out.println(string);
    }

    void println(ArrayList<String> string) {
        System.out.println();
    }
}

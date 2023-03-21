package HomeWork_4;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_4 {

    public static void main(String[] args){
        System.out.println("Введите текст через 'червячка😁' (~): ");
        System.out.println("Если Хочеш, всЁ-ЁЁ хватит ? Набирай букАвки stop: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listData = new ArrayList<>();
        while (true) {
            String text = sc.nextLine();
            try {
                if (text.equals("stop")) {
                    break;
                }
                Integer.parseInt(text.split("~")[1]);
                StringConstructor(text, listData);
            } catch (Exception e) {
                System.out.println("Не-а не так!");
            }
        }
    }

    static void StringConstructor(String text, ArrayList<String> listData) {
        String[] stringBase = text.split("~");
        int num = Integer.parseInt(stringBase[1]);
        int localSize = num - listData.size();
        for (int i = 0; i <= localSize; i++) {
            listData.add("");
        }
        if (stringBase[0].equals("print")) {
            System.out.println(listData.get(num));
        } else {
            listData.set(num, stringBase[0]);
        }
    }

}

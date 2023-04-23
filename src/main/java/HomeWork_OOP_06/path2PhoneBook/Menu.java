package HomeWork_OOP_06.path2PhoneBook;

import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class Menu {
    public static void MainMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Отобразить справочник");
        System.out.println("2 - Выгрузить данные");
        System.out.println("3 - Загрузить данные");

        System.out.println(". ".repeat(15));
        System.out.println("Выберите действие: ");

        int input = in.nextInt();
        FileMenu run = new FileMenu();
        InfoBook phones = new InfoBook();
        phones.InfoBook();

        switch (input) {
            case 1:
                phones.showInfoBook(phones.pb);
                break;
            case 2:
                run.ExportFile(phones.pb);
                System.out.println("Export finish");
                break;
            case 3:
                //phones.showInfoBook();
                phones.showInfoBook(run.ImportFile());
                break;


        }
    }
}

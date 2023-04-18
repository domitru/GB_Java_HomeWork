package HomeWork_OOP_05.path2PhoneBook;

import java.util.Scanner;

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
        phones.Adressbook();

        switch (input) {
            case 1:
                phones.showAddressBook();
                break;
            case 2:
                run.ExportFile(phones.pb);
                System.out.println("Export finish");
                break;
            case 3:
                run.ImportFile(phones.pb);
                phones.showAddressBook();
                break;


        }
    }
}

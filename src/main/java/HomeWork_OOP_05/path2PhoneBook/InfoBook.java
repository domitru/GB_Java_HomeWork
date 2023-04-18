package HomeWork_OOP_05.path2PhoneBook;

import java.util.ArrayList;

public class InfoBook {
    ArrayList<PhoneBook> pb = new ArrayList();

    public void Adressbook() {
        pb.add(new PhoneBook("Семёнов Семён ", "+70003453434", "Ладога"));
        pb.add(new PhoneBook("Казинов Казимт ", "+70003453434", "Петрушино"));
    }

    public void showAddressBook() {
        for (PhoneBook i : pb) {
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
    }
}

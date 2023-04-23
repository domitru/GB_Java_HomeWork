package HomeWork_OOP_06.path2PhoneBook;

import java.util.ArrayList;

public class InfoBook {
    ArrayList<PhoneBook> pb = new ArrayList();

    public void InfoBook() {
        pb.add(new PhoneBook("Семёнов Семён ", "+70003453434", "Ладога"));
        pb.add(new PhoneBook("Казинов Казимт ", "+70003453434", "Петрушино"));
    }

    public void showInfoBook(ArrayList<PhoneBook> phnbook) {
        for (PhoneBook i : phnbook) {
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
    }
}

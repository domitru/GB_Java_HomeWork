package HomeWork_OOP_05.path2PhoneBook;

import java.util.ArrayList;

public class PhoneBook {
    public ArrayList<PhoneBook> pb;
    String Name;
    String Phone;
    String City;

    public PhoneBook(String name, String phone, String city) {
        this.Name = name;
        this.Phone = phone;
        this.City = city;
    }

    public PhoneBook() {

    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getCity() {
        return City;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void Phone() {
    }

    public void showAddressBook() {
    }
}

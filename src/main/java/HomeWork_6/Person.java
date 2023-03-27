package HomeWork_6;

import java.sql.Array;

public class Person {

    String name;
    String surname;
    String age;
    String gender;
    String profession;
    String city;

    public Person(String SurName, String Name, String Age,
                  String Gender, String Profession, String City) {

        this.surname = SurName;
        this.name = Name;
        this.age = Age;
        this.gender = Gender;
        this.profession = Profession;
        this.city = City;
    }

   // @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s", surname, name, age, gender, profession, city);
    }

    //@Override
    public boolean equals(Object arg) {
        if (arg == null)
            return false;
        if (!(arg instanceof Person))
            return false;
        Person anotherPerson = (Person) arg;
        return surname.equals(anotherPerson.surname) && name.equals(anotherPerson.name)
                && age.equals(anotherPerson.age) && gender.equals(anotherPerson.gender)
                && profession.equals(anotherPerson.profession)
                && city.equals(anotherPerson.city);
    }

   // @Override
    public int hashCode() {
        Object[] m = { name, surname, age, gender, profession, city };
        int res = 1;
        for (Object x : m) {
            res = 31 * res + x.hashCode();
        }
        return res;
    }
}

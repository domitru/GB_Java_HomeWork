package HomeWork_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person person1 = new Person("Жижиков", "Ив", "45", "м", "тест-мастер", "Кемерово");
        Person person2 = new Person("Резков", "Рон", "23", "м", "сисадмин", "Кемерово");
        Person person3 = new Person("Смирнчан", "Игл", "19", "м", "менеждер", "Кемерово");
        Person person4 = new Person("Трезголов", "Пет", "20", "м", "программист", "Кемерово");
        Person person5 = new Person("Веганов", "Сем", "21", "м", "повар", "Кемерово");
        Person person6 = new Person("Кровов", "Мар", "18", "м", "маркетолог", "Кемерово");
        Person person7 = new Person("Сёмкина", "Жизель", "35", "ж", "секретарь", "Кемерово");
        Person person8 = new Person("Косина", "Марго", "37", "ж", "бугалтер", "Кемерово");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);

        // for (String[] work : workers) {
        //     if (Integer.parseInt(work[2]) > 20) {
        //         Person staff = new Person(work[0], work[1], work[2], work[3], work[4], work[5]);
        //         System.out.println(staff);
        //     }
        // }

        for (Person work : persons) {
            if (Integer.parseInt(work.age) > 20) {
                System.out.println(work);
            }

        }

       // System.out.println(person1.name.equals(person3.name));
        System.out.println(person1.surname.hashCode());
        System.out.println(person4.surname.hashCode());

    }

}
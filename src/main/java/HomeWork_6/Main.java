package HomeWork_6;

    /*
    Создать класс Person.
У класса должны быть поля:
1. Имя (String)
2. Фамилия (String)
3. Возраст (продумать тип)
4. Пол
5*. Придумать свои собственные поля
Для этого класса
1. Реализовать методы toString, equals и hashCode.
2*. Придумать собственные методы и реализовать их
В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
     */


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person person1 = new Person("Жижиков", "Ив", "45", "м", "тест-мастер", "Кемерово");
        Person person2 = new Person("Резков", "Рон", "23", "м", "сисадмин", "Симиртау");
        Person person3 = new Person("Смирнчан", "Игл", "19", "м", "менеждер", "Кемерово");
        Person person4 = new Person("Трезголов", "Пет", "20", "м", "программист", "Кемерово");
        Person person5 = new Person("Веганов", "Сем", "21", "м", "повар", "Симиртау");
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


        for (Person work : persons) {
            if (Integer.parseInt(work.age) > 20) {
                System.out.println(work);
            }

        }

        System.out.println(person1.name.equals(person8.name));
        System.out.println(person1.surname.hashCode());
        System.out.println(person6.surname.hashCode());
        System.out.println(persons.toString());

    }

}
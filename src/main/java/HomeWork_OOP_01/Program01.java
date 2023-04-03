package HomeWork_OOP_01;

public class Program01 {
    public static void main(String[] args) {
        //Взрослые
        Person01 irina = new Person01("Ирина", 56);
        Person01 igor = new Person01("Игорь", 60);

        Person01 vasya = new Person01("Вася", 30);
        Person01 masha = new Person01("Маша", 27);

        Person01 jane = new Person01("Женя", 39);
        Person01 ivan = new Person01("Ваня", 45);

        //Дети

        Person01 sasha = new Person01("Саша", 9);
        Person01 gena = new Person01("Гена", 10);
        Person01 dima = new Person01("Дима", 11);
        Person01 lena = new Person01("Лена", 12);
        Person01 timur = new Person01("Тимур", 3);

        GeoTree01 gt = new GeoTree01();
        gt.appendVifeHusbent(irina, igor); // Ирина жена Игоря
        gt.appendVifeHusbent(masha, vasya); // Маша жена Васи

        gt.appendPerentChild(irina, vasya); // Ирина родитель Васи
        gt.appendPerentChild(igor, masha); // Игорь родитель Маши
        gt.appendPerentChild(vasya, sasha); // Вася родитель Саши
        gt.appendPerentChild(masha, sasha); // Маша родитель Саши


        gt.appendPerentChild(igor, vasya); // Игорь родитель Васи
        gt.appendPerentChild(jane, masha); // Женя родитель Маши
        gt.appendPerentChild(igor, gena); // Игорь родитель Гены
        gt.appendPerentChild(jane, dima); // Женя родитель Димы
        gt.appendPerentChild(jane, lena); // Женя родитель Лены
        gt.appendPerentChild(ivan, timur); // Иван родитель Тимура

        // Ищем детей Жени
        System.out.println("Дети Жени");
        System.out.println(new Research01(gt).spend(jane, Relationship01.parent));
        // Ищем детей Игоря
        System.out.println("Дети Игоря");
        System.out.println(new Research01(gt).spend(igor, Relationship01.parent));

        // Ищем мужа Ирины (Чья жена Ирина?)
        System.out.println("Муж Ирины");
        System.out.println(new Research01(gt).spend(irina, Relationship01.vife));
        // Кто же жена Васи ?
        System.out.println("Жена Васи");
        System.out.println(new Research01(gt).spend(vasya, Relationship01.husbent));
        // Дети Васи
        System.out.println("Дети Васи");
        System.out.println(new Research01(gt).spend(vasya, Relationship01.parent));
        // кто родители?
        System.out.println("Родитель Лены ?");
        System.out.println(new Research01(gt).spend(lena, Relationship01.children));

        // Ищем людей определенного возраста
        System.out.println(new Research01(gt).searchAge());
    }
}
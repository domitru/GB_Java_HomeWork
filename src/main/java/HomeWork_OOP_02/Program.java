package HomeWork_OOP_02;

public class Program {
    public static PrinterImple printer = new PrinterImple();


    public static void main(String[] args) {
        SaveFiles saveFiles = new PrinterImple();
        //Взрослые
        Person irina = new Person("Ирина", 56);
        Person igor = new Person("Игорь", 60);

        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 27);

        Person jane = new Person("Женя", 39);
        Person ivan = new Person("Ваня", 45);

        //Дети

        Person sasha = new Person("Саша", 9);
        Person gena = new Person("Гена", 10);
        Person dima = new Person("Дима", 11);
        Person lena = new Person("Лена", 12);
        Person timur = new Person("Тимур", 3);

        GeoTree gt = new GeoTree();
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
        //System.out.println("Дети Жени");
        printer.print("Deti Geni");
        //printer.println(new Research(gt).spend(jane, Relationship.parent));
        System.out.println(new Research(gt).spend(jane, Relationship.parent));
        saveFiles.saveFile(String.valueOf(new Research(gt).spend(jane, Relationship.parent)));

        // Ищем детей Игоря
        printer.print("Дети Игоря");
        System.out.println(new Research(gt).spend(igor, Relationship.parent));
        saveFiles.saveFile(String.valueOf(new Research(gt).spend(igor, Relationship.parent)));

        // Ищем мужа Ирины (Чья жена Ирина?)
        printer.print("Муж Ирины");
        System.out.println(new Research(gt).spend(irina, Relationship.vife));
        // Кто же жена Васи ?
        printer.print("Жена Васи");
        System.out.println(new Research(gt).spend(vasya, Relationship.husbent));
        // Дети Васи
        printer.print("Дети Васи");
        System.out.println(new Research(gt).spend(vasya, Relationship.parent));
        // кто родители?
        printer.print("Родитель Лены ?");
        System.out.println(new Research(gt).spend(lena, Relationship.children));

        // Ищем людей определенного возраста
        System.out.println(new Research(gt).searchAge());


    }

}
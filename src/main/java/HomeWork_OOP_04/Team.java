package HomeWork_OOP_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Person> implements Iterable<T> {

    List<T> persons = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return persons.iterator();
    }

    public Team<T> addPersons(T person) {
        persons.add(person);
        return this;
    }

    public int maxRange() {
        int max = 0;
        for (T person : this) {
            if (person instanceof Archer) {
                Archer archer = (Archer) person;  // приведение типов
                if (archer.getRange() > max);
                max = archer.getRange();
            }

        }
        return max;
    }

    @Override
    public String toString() {
        return "Team{" +
                " persons = " + persons +
                '}';
    }
}


package TestHW_04_Final;

import java.util.ArrayList;
import java.util.Iterator;


public class Komanda<E extends Chelovek> implements Iterable<E> {
    ArrayList<E> cheloveks = new ArrayList<>();

    @Override
    public Iterator<E> iterator() {
        return cheloveks.iterator();
    }

    public Komanda<E> addChelovek(E chelovek) {
        cheloveks.add(chelovek);
        return this;
    }

    @Override
    public String toString() {
        return "Команда{" + "chelovek = " + cheloveks +
                '}';
    }
    public int maxRange() {
        int max = 0;
        for (E t : this
        ) {
            if (t instanceof Spartanec) {
                Spartanec spartanec = (Spartanec) t;
                if (spartanec.getSpeed() > max) {
                    max = spartanec.getSpeed();
                }
            }

        }
        return max;
    }
}

package TestHW_04_Final;

public abstract class Zashita implements Oborona {
    public abstract String vidZashiti();

    @Override
    public String toString() {
        return String.format("Тип защиты: %s Колличество защиты: %d ",vidZashiti(),zashitaOtUrona());
    }
}

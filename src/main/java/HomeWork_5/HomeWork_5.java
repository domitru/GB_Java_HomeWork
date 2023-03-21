package HomeWork_5;
import java.util.*;
public class HomeWork_5 {
    /**
     * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
     *
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     *
     */
    public static void main(String[] args){
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        sortByLenght(text);
    }
    private static void sortByLenght(String text){
        String[] splitText = text.split(" ");
        Map<Integer, List<String>> stats = new HashMap<>();
        for (String string : splitText) {
            List<String> sortString = new ArrayList<String>();
            if(stats.containsKey(string.length())){
                sortString = stats.get(string.length());
            }
            sortString.add(string);
            stats.putIfAbsent(string.length(), sortString);
        }
        for (Collection<String> s : stats.values()) {
            System.out.println(s);
        }
    }
}

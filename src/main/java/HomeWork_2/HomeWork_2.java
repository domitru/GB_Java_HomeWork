package HomeWork_2;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println(buildString(6, 'a','b'));

        System.out.println(buildStringHundredTimes("Text", 100));
        saveFileHW(buildStringHundredTimes("Text", 100));

        //System.out.println(strDoom("aaaaabbbbcdd")); // Работа на семинаре -->>> a5b4cd2
    }
//  ДЗ:
//    1. Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N,
//    которая состоит из чередующихся символов c1 и c2, начиная с c1. -->> (6, 'a', 'b') -> "ababab"

    private static String buildString(int n, char one, char two) {
        String str = new String();
        for (int i = 0; i < n; i++) {
            str += (i % 2 == 0) ? one : two;
        }
        return str;
    }


//    2. Создать файл с названием file.txt. Если файл уже есть,
//    то создавать не надо Записать в него Слово "TEXT" 100 раз

    static void saveFile(String createdString) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file_ab.txt");
            File file = new File(pathFile);

            if (file.createNewFile()) {
                System.out.println("file.created");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(createdString);
                fileWriter.flush();
                fileWriter.close();
            } else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println(createdString);
        }
    }
    static String buildStringHundredTimes(String s , int n) {
        return s.repeat(n);
    }

    static void saveFileHW(String createdString) {
        try {
            Path of = Path.of("file.txt");

            if (!Files.exists(of)) {
                System.out.println("file.created");
                Files.createFile(of);
                Files.writeString(of,createdString);
            } else {
                System.out.println("file.existed");
            }
        } catch (Exception e){
            e.getMessage();
        }
    }




//    Работа не семинаре.
//    Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. результат - a4b3cd2

//    private static String strDoom(String str) {
//        if (str == "") return str;
//        String rle = new String();
//        rle += str.charAt(0);
//        Integer count = 1;
//        for (int i = 1; i < str.length(); i++) {
//            if (str.charAt(i - 1) == str.charAt(i)) count++;
//            else {
//                rle += (count == 1) ? str.charAt(i) : Integer.toString(count) + str.charAt(i);
//                count = 1;
//            }
//        }
//        if (count > 1) rle += count;
//        return rle;
//    }
}




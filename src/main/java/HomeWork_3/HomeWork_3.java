package HomeWork_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class HomeWork_3 {

    public static void main(String[] args) {
        //    1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
        //System.out.println(randomaiser());
        //sortedArrayList(randomaiser());  // 1-е задание, передает рандомно заполненый список.

        ArrayList<String> listDifferent = new ArrayList<>(List.of("!", "Hello", "4", "string", "s", "5", "10", "-12", "my_value"));
        delNumList(listDifferent);
    }
//    private static ArrayList<Integer> randomaiser(){
//        Random proizvol = new Random();
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            int num = proizvol.nextInt(-20, 20);
//            list.add(num);
//        }
//        return list;
//    }
//    private static void sortedArrayList (ArrayList<Integer> list_2){
//        System.out.println(list_2);
//
//        int i = 0;
//        while (i < list_2.size()){
//            if(list_2.get(i) % 2 != 0){
//                list_2.remove(i);
//            }else{
//                i++;
//            }
//        }
//        System.out.println(list_2);
//
//    }

    private static void delNumList(ArrayList<String> list) {
//  2. Дан список ArrayList<String>. Удалить из него все строки,которые являются числами
//  Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
//  -->> ["string", "s", "my_value"]
        System.out.println(list);  // Печать полученного массива строк
        int i = 0;
        boolean flag = false ;
        while (i < list.size()){  // цикл по длине массива
            String string = list.get(i);  // Выдергиваем по индексу i из массива строку, кладем в string
            // System.out.print(string + "  ");
            // System.out.print(string.getClass() + "  ");
            flag = string.matches("-?\\d+(\\.\\d+)?"); //проверка строки, число или нет,возвращает
                                                              // значение false или true.
            //System.out.println(flag);
            if (flag == true) {      // если строка цисловая , то.....
                // System.out.print(string + "  ");
                list.remove(string);   //  удаляем из массива строк(list) значение в (string)
                i--;            //  при удалении идет смещение индексов, -- дает возврат по сммещеию
                //System.out.println(list);
            }else {
                //System.out.println(list);
            }
            i++;
        }
        System.out.println(list);
    }
}

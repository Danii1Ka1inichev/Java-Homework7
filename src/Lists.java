/*#3 Реализовать метод, который принимает на вход список элементов любого типа данных,
создает список из 100 элементов заполненный элементами из переданного списка в случайном порядке
(Загуглить генерация случайных чисел Java)*/

import java.util.ArrayList;
import java.util.Random;

public class Lists {


    public static <T> void gen(ArrayList<T> params){

        Random random = new Random();
        ArrayList<T> allItem  = new ArrayList<>();
        for(int i = 0; i<100; i++){
            int pos = random.nextInt(params.size());
            allItem.add(params.get(pos));
        }

        for(int i = 0; i<allItem.size(); i++){
            System.out.println("Item "+(i+1)+" = "+allItem.get(i));
        }
    }

    public static void main(String[] args){

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("QWE");
        list2.add("ERT");
        list2.add("RTY");

        ArrayList<Boolean> list3 = new ArrayList<>();
        list3.add(true);
        list3.add(false);

        ArrayList<Double> list4 = new ArrayList<>();
        list4.add(1.1);
        list4.add(2.2);
        list4.add(3.3);

        Lists.<Integer>gen(list1);
        Lists.<String>gen(list2);
        Lists.<Boolean>gen(list3);
        Lists.<Double>gen(list4);

    }
}

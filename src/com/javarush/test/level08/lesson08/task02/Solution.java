package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution


{

    public static void main(String[] args)
    {


    }
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> integers = new HashSet<Integer>();

        for (int i = 0;i < 20;i++){


            integers.add(i);


        }

        return integers;


    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

        Iterator<Integer> iterator = set.iterator();//вызываем итератор

        while (iterator.hasNext()){

            if (iterator.next()>10) iterator.remove(); //если значение больше 10, то удаляем и переходим к следующему


        }

return set;

    }
}

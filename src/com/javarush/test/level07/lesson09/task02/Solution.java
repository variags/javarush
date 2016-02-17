package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        for (int i=0; i < 5; i++){

            //String s = reader.readLine();
            list.add(reader.readLine());


        }

        list.remove(2); //считает с нуля(по этому два)

        for(int i = list.size()-1;i >= 0;i-- ){ //цикл выводит значения массива на экран в обратном порядке.

            System.out.println(list.get(i));


        }

    }
}

package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //создаем объект , который будет позволять вводть/выводить текст с клавиатуры.
      ArrayList<String> list = new ArrayList<String>(); //создаем списочный массив строк

        for (int i = 0;i < 5; i++){ //данный цикл будет записывать вводимые строки в массив

            String s = reader.readLine();
            list.add(s);

        }

        int max = 0; //целочисленная переменная макс будет использоваться в цикле для поиска самой длинной строки в массиве
        for (int i = 0;i < list.size(); i++){  //этот цикл будет искать самую длинную строку в массиве и если она не одна он выведет каждую строку с нвой строки
           String s = list.get(i);
            int count = s.length();
            if (count > max){

                max = count;}

            }

            for (int i = 0;i< list.size();i++){ //выведет строки массива на экран
                if(max == list.get(i).length()){
                    System.out.println(list.get(i));



            }


        }




}}

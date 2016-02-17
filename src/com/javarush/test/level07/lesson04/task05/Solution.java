package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int num[] = new int[20];
        int num1[] = new int[10];
        int num2[] = new int[10];


        for (int i = 0; i < num.length; i++) //цикл заполнит массив 20 ю числами(вводом с клавиатуры)
        {

            num[i] = Integer.parseInt(reader.readLine());



        }
        for (int i = 0;i < num1.length;i++){ // копируем данные из большего массива в два мальньких и выводим

            num1[i] = num[i];
            num2[i] = num[i+10];
            System.out.println(num2[i]);
        }



    }
}

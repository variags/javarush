package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       String [] list = new String[10];

        //Scanner scanner = new Scanner(System.in);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String a;


        for (int i = 0;i < list.length;i++){ //с помощью этого цикла записываем вводимые строки в массив



            list[i]  = reader.readLine();
        }
        for (int j = list.length-1;j >= 0; j--){ //с помощью этого цикла вывводим значения сохраненые в массив в обратном порядке.

            System.out.println(list[j]);

        }

    }
}
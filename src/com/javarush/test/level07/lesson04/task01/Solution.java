package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException
    {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //создаем объект с помощью которого будем вводить/выводить текст


        int[] ar = new int[20];//создаем массив на 20 чисел

        for (int i = 0; i < ar.length; i++) //записывать введеные числа в массив

        {
            ar[i] = Integer.parseInt(reader.readLine());

        }

        return ar;
    }

    public static int max(int[] array) //с помощью этого метода вывести максимальное число из введенных числе в массив
    {

        int max;
        max = array[0];
        for (int i = 1; i < array.length; i++)

            if (array[i] > max)
            {
                max = array[i];
            }
        return max;
    }
}

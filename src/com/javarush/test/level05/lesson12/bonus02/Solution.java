package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e)
    {


        if (a < b && a < c && a < d && a < e)
        {


            //System.out.println(a);

            return a;

        } else if (b < a && b < c && b < d && b < e)
        {


            //System.out.println(b);
            return b;


        } else if (c < a && c < b && c < d && c < e)
        {


            //System.out.println(c);

            return c;

        } else if (d < a && d < b && d < c && d < e)
        {


            //System.out.println(d);

            return d;

        } else if (e < a && e < b && e < c && e < d)
        {


            //System.out.println(e);

            return e;

        }

        return 0;


    }
}


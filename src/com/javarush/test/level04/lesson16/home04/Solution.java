package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        //String age = reader.readLine();

        int years = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int day = Integer.parseInt(reader.readLine());




        System.out.println("Меня зовут " + name +"\nЯ родился " + day + "." + month + "." + years);
        //System.out.println( );



    }
}

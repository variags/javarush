package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно заменить функциональность программы
Задача:  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //объект reader вводит/выводит текст с клавиатуры на экран

        ArrayList<String> list = new ArrayList<String>(); //списочный массив List
        while (true) //цикл (добавления строк)выключится только тогда , когда будет введена пустая строка
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>(); //списочный массив в который будут скопированы данные и массива list
        for (int i = 0; i < list.size(); i++) //цикл будет работать сколько значений в массиве
        {
            String s = list.get(i);
            if(s.length() % 2 == 0) //условие - если длинна строки делится на 2 , добавляем ее один раз
            {
                listUpperCase.add(s + " " + s);
            }
            else listUpperCase.add(s + " " + s + " " + s); //условие - если длинна строки делится на 2 , добавляем ее два раза
            }


        for (int i = 0; i < listUpperCase.size(); i++)
            System.out.println(listUpperCase.get(i)); //вывести на экран полученые значения записанные в массив listUpperCase
        }
    }

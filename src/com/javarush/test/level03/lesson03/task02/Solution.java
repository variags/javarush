package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
for (int i = 0; i <= 1; i++)
{
    convertEurToUsd(65, 1.0955); //вызвал метод convertEurToUsd дважды
}
    }

    public static double convertEurToUsd(int eur, double course)
    {


        double dollar = eur * course; //Реализовал метод

        System.out.println(dollar);
        return dollar;
    }
}

package com.javarush.test.level03.lesson04.task01;

/* Дата рождения
Вывести на экран дату своего рождения в виде: MAY 1 2012
*/

public class Solution
{
    public static void main(String[] args)
    {

        DateOfBirth("JUN", 16, 1987);


    }

public static void DateOfBirth(String month,  int day, int year ){

    System.out.println(month + " " + day + " " + year );
    //return ;

}

}
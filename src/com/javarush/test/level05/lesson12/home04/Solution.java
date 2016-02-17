package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Solution
{
    public static void main(String[] args)
    {

        String time = "14 01 2016";

        System.out.println(time);

        /*Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat(date);

        System.out.println(date +"\n"+ dateFormat.format(new Date()));*/
    }
}

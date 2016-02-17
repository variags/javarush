package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{

    public static int convertToSeconds(int hour){

        int minutes = 60;
        int second = 60;


        hour = hour * minutes * second;

        System.out.println(hour);
        return hour;
    }

    public static void main(String[] args) {

        for (int i = 0; i <=1;i++)
        {
            convertToSeconds(7);
        }
    }
}
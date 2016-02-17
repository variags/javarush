package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        Scanner scanner = new Scanner(System.in);

        String i;

        int sum = 0;

        //String text = "сумма";
        while (true)
        {


            i = scanner.nextLine();




            if (i.toLowerCase().equals("сумма"))
            {


                break;


            } else
            {
                sum += Integer.parseInt(i);
            }


        }
        System.out.println(sum);

    }
}

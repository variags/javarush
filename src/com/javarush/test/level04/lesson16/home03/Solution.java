package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {




        int i;
        int sum = 0;


        Scanner scanner = new Scanner(System.in);
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            i = scanner.nextInt();
            sum += i;




            if(i == -1){
                break;
            }
        }
        System.out.println(sum);//Напишите тут ваш код

   // public static void sum (int a, int b, int c){




    }}



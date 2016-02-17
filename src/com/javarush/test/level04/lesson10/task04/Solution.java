package com.javarush.test.level04.lesson10.task04;

import java.io.*;
import java.util.Scanner;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        Scanner scanner = new Scanner(System.in);

        String S = "SSSSSSSSSS";


        int i = 1;
        while (i <= 10)
        {

            System.out.println(S);
        i++;

        }
    }
}

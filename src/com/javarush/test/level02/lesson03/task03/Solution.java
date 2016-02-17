package com.javarush.test.level02.lesson03.task03;

/* Кодим на Java
Напиши программу, которая выводит на экран надпись: «Будешь плохо кодить, придет Java и съест твою память».
*/
public class Solution
{
    public static void main(String[] args)
    {
        Title title = new Title();

        Title1(title);
    }

    public static void Title1(Title title){
    System.out.println(title.t);

    }

    public static class Title{

        String t = "Будешь плохо кодить, придет Java и съест твою память";

    }

}

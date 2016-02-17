package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Human gFather = new Human("GrandFather", true, 55, null, null);
        Human gFather1 = new Human("GrandFather1", true, 55, null, null);
        Human gMother = new Human("GrandMother", false, 56, null, null);
        Human gMother1 = new Human("GrandMOther2", false, 54, null, null);
        Human father = new Human("Father", true, 30, null, null);
        Human mother = new Human("Mother", false, 29, null, null);
        Human child = new Human("Ratibor", true, 3, father, mother);
        Human child1 = new Human("Child1", true, 0, null, null);
        Human child2 = new Human("Child2", true, 0, null, null);

        System.out.println(gFather);
        System.out.println(gFather1);
        System.out.println(gMother);
        System.out.println(gMother1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);
        System.out.println(child1);
        System.out.println(child2);


    }

    public static class Human
    {
       private String name;
        private boolean sex;
        private  int age;

        private  Human father ;
        private  Human mother ;

        Human (String name, boolean sex ,int age, Human father, Human mother){


            this.name = name;
            this.sex = sex;
            this.age = age;

            this.father = father;
            this.mother = mother;



        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}

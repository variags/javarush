package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man = new Man();
        Man man1 = new Man();

        Woman woman = new Woman();
        Woman woman1 = new Woman();

        man.address = "UA";
        man.name = "MIkhail";
        man.age = 44;


        man1.address = "U3";
        man1.name = "MIkha";
        man1.age = 17;

        woman.name = "Tanya";
        woman.age = 21;
        woman.address = "rf";

        woman1.name = "Tanya";
        woman1.age = 22;
        woman1.address = "rf22";

        System.out.println(man.name+" " + man.age + " " + man.address);
        System.out.println(man1.name+" " + man1.age + " " + man1.address);
        System.out.println(woman.name+ " "+ woman.age + " " + woman.address);
        System.out.println(woman1.name+ " "+ woman1.age + " " + woman1.address);
    }

    public static class Man{


        String name;
        int age;
        String address;

    }


    public static class Woman{


        String name;
        int age;
        String address;

    }
}

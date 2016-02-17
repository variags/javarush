package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public void main(String[] args)
    {


        Cat cat = new Cat();
        cat.name = "Den";
        cat.age = 3;
        cat.weight = 1;
        cat.strength = 4;

        Cat cat1 = new Cat();
        cat1.name = "Den";
        cat1.age = 3;
        cat1.weight = 1;
        cat1.strength = 4;

        cat.fight(cat1);


    }


    public Cat()
    {

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;


    }

    public boolean fight(Cat anotherCat)
    {

        if (this.strength > anotherCat.strength)
        {


            return true;

        } else
        {
            return false;
        }


    }
}

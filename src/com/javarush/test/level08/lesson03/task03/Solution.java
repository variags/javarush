package com.javarush.test.level08.lesson03.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"}; //создается массив

        HashMap<String, Cat> map = addCatsToMap(cats); //создается колекция

        for (Map.Entry<String, Cat> pair : map.entrySet())  // с помощью этого цикла будет выгружено содержимое колекции
        {
            System.out.println(pair.getKey() + " - " + pair.getValue()); //данные будут выводится через тере
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) //с помощью этого метода будут добавляться данные в коллекцию
    {
        HashMap<String, Cat> addCats = new HashMap<String, Cat>();
        for (String s : cats)
        {


            addCats.put(s, new Cat(s));






        }

        return addCats;
    }


    public static class Cat //в этом классе будут данные в переводится в верхний регистр
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }
}

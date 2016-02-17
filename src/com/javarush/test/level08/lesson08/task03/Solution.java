package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map,"Антон"));
        System.out.println(getCountTheSameLastName(map,"Иванов"));
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> names = new HashMap<>();

        names.put("simonov", "mikhail");
        names.put("simonov", "mikhail");
        names.put("simonov", "mikhail");
        names.put("simonov", "mikhail");
        names.put("simonov", "mikhail");
        names.put("simonov", "mikhail");
        names.put("simonov", "mikhail");
        names.put("simonov", "mikhail");
        names.put("simonov", "mikhail");
        names.put("simonov", "mikhail");



        return names;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int count=0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (name.equals(value))
            {
                count++;
            }
        }
        return count;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count=0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (lastName.equals(value))
            {
                count++;
            }
        }
        return count;

    }
}

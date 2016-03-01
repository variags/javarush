package TestForTest.num_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by m.simonov on 03.02.2016.
 */
public class num

{

    public static void main(String[] args) throws Exception{


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();


        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){



            set.add(Integer.parseInt(reader.readLine()));



        }



        while (iterator.hasNext()){

Integer next = iterator.next();

            System.out.println(next);




        }





    }


}

package com.company;

import java.util.HashSet;

public class sumofTwo {

    public static void main(String[] args) {
        int[] a = {1,5,3};
        int[] b = {10,20,30,40};
        int v = 42;
        boolean boo = false;

        HashSet<Integer> comArray = new HashSet<>();

        for (int i = 0; i<a.length;i++)
        {
            int difference = v-a[i];
            comArray.add(difference);
        }
        for (int j = 0; j<b.length ; j++)
        {
            if (comArray.contains(b[j]))
                System.out.println(boo=true);
        }
        System.out.println(boo);
    }
}

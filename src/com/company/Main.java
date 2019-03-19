package com.company;


import java.util.*;


public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{1, 0, 1};
        int[] b = new int[]{1, 1, 1};
        int[] c = new int[3];



        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println(Arrays.toString(c));


        new Both(a, b);
        new ElementRemove(a,b,c);

    }
}
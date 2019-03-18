package com.company;


import java.util.Arrays;


import static java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{1,0,1};
        int[] b = new int[]{1,1,1};
        int[] c = new int[3];

        int nextInt = 0;

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println(Arrays.toString(c));


        int[] both = copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, both, a.length, b.length);
        System.out.println(Arrays.toString(both));


        int[] f = removeElement(a, 2);

        System.out.println(Arrays.toString(f));

    }
    private static int[] removeElement(int[] n, int i) {
        System.arraycopy(n, i + 1, n, i, n.length - 1 - i);
        return n;
    }
}
package com.company;

import java.util.Arrays;
import java.util.Scanner;

class ElementRemove {

    ElementRemove(int[] a ,int[] b ,int[] c  ){
        int s;
        int in;

        Scanner scar = new Scanner(System.in);
        Scanner scer = new Scanner(System.in);

        System.out.println("Введите номер массива:");
        s = scar.nextInt();

        System.out.println("Введите номер элемента массива:");
        in = scer.nextInt();

        if (s == 1 && in <= a.length) {
            removeElement(a, in);
            System.out.println(Arrays.toString(a));

        } if (s == 2 && in <= b.length) {
            removeElement(b, in);
            System.out.println(Arrays.toString(b));

        } if (s == 3 && in <= c.length) {
             removeElement(c, in);
            System.out.println(Arrays.toString(c));

        } else System.out.println("Error");
    }

    private void removeElement(int[] n, int i){
        System.arraycopy(n, i + 1, n, i, n.length - 1 - i);
    }
}



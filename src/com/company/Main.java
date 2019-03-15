package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int n;
        Scanner scar = new Scanner(System.in);

        System.out.println("Введите количество цифр в массивах: ");

        n = scar.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        String cString = Arrays.toString(c);

        for (int i = 0; i < n; i++) {

            System.out.print("Введите а[" + i + "] =  ");
            a[i] = scar.nextInt();

            if (a[i] <= 1 && a[i] >= 0) {

                System.out.print("Введите b[" + i + "] =  ");

                b[i] = scar.nextInt();

                if (b[i] > 1 && b[i] < 0) {
                    System.out.println("Error");
                    break;
                }

            } else {
                System.out.println("Error");
                break;
            }
            c = addElement(c, a[i] * b[i]);
        }
        System.out.println(cString);
    }
    private static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }

}
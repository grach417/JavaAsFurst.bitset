package com.company;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

class Both {

    Both(int [] furst, int[] second ){

        int[] both = copyOf(furst, furst.length + second.length);

        System.arraycopy(second, 0, both, furst.length, second.length);

        System.out.println(Arrays.toString(both));
    }
}

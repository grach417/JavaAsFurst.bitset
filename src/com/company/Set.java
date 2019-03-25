package com.company;




import java.util.HashSet;



public class Set {
    HashSet<Integer> a = new HashSet<>();
    HashSet<Integer> b = new HashSet<>();

    public HashSet<Integer> intersect(){
        HashSet<Integer> result = new HashSet<>();
        for (Integer t : a) {
            if (b.contains(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public HashSet<Integer> union (){

        HashSet<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;

    }

    public HashSet<Integer> additionA(){

        HashSet<Integer> result = new HashSet<>();
        for (Integer t : a) {
            if (!b.contains(t)) {
                result.add(t);
            }
        }
        return result;

    }
    public HashSet<Integer> additionB(){

        HashSet<Integer> result = new HashSet<>();
        for (Integer t : b) {
            if (!a.contains(t)) {
                result.add(t);
            }
        }
        return result;

    }

}

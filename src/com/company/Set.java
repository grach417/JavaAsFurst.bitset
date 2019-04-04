package com.company;




import java.util.HashSet;
import java.util.Iterator;


class Set {
    public HashSet<Integer> result;
    private HashSet<Integer> a;
    private HashSet<Integer> b;
    private int value;


    Set (HashSet<Integer> a, int value) {
        this.a = a;
        this.value = value;
    }
    

    Set (HashSet<Integer> a, HashSet<Integer> b) {
        this.a = a;
        this.b = b;
    }


    void intersect() {
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (b.contains(t)) {
                result.add(t);
            }
        }
    }


    void union() {

        result.addAll(a);
        result.addAll(b);

    }

    void addition() {


        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (!b.contains(t)) {
                result.add(t);
            }
        }

    }


    boolean removeElementA() {

        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (t == value)
                return true;
        }
        return false;
    }

}






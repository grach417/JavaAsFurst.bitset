package com.company;




import java.util.HashSet;
import java.util.Iterator;


class Set {

    private HashSet<Integer> a;
    private HashSet<Integer> b;
    private int indA;
    private int indB;


    Set(HashSet<Integer> a, HashSet<Integer> b, int indA, int indB) {
        this.a = a;
        this.b = b;
        this.indA = indA;
        this.indB = indB;
    }
    Set(HashSet<Integer> a, HashSet<Integer> b) {
        this.a = a;
        this.b = b;
    }

    void intersect() {
        HashSet<Integer> result = new HashSet<>();
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (b.contains(t)) {
                result.add(t);
            }
        }
    }


    void union() {

        HashSet<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);

    }

    void additionA() {

        HashSet<Integer> result = new HashSet<>();
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (!b.contains(t)) {
                result.add(t);
            }
        }

    }

    void additionB() {

        HashSet<Integer> result = new HashSet<>();
        Iterator<Integer> iterator = b.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (!a.contains(t)) {
                result.add(t);
            }
        }

    }

    void removeElementA() {

        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (t == indA)
                return;
        }
    }
    void removeElementB() {

        Iterator<Integer> iterator = b.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (t == indB)
                return;
        }
    }

}




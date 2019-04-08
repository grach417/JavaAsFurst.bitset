package com.company;


import java.util.Iterator;
import java.util.LinkedHashSet;


class Set {


    LinkedHashSet<Integer> intersect(LinkedHashSet<Integer> a, LinkedHashSet<Integer> b) {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (b.contains(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public LinkedHashSet<Integer> union(LinkedHashSet<Integer> a, LinkedHashSet<Integer> b) {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    public LinkedHashSet<Integer> addition(LinkedHashSet<Integer> a, LinkedHashSet<Integer> b) {

        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (!b.contains(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public LinkedHashSet<Integer> removeElement(LinkedHashSet<Integer> a, int element) {
        LinkedHashSet<Integer> result = new LinkedHashSet<>(a);
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (t == element) {
                result.remove(t);
            }
        }
        return result;
    }


    public LinkedHashSet<Integer> removeElements(LinkedHashSet<Integer> a,LinkedHashSet<Integer> b) {
        LinkedHashSet<Integer> result = new LinkedHashSet<>(a);
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (b.contains(t)) {
                result.remove(t);
            }
        }
        return result;
    }

    public LinkedHashSet<Integer> addElement(LinkedHashSet<Integer> a, int element){
        a.add(element);
        return a;
    }
    public LinkedHashSet<Integer> addElements(LinkedHashSet<Integer> a, LinkedHashSet<Integer> b){
        a.addAll(b);
        return a;
    }

    boolean trueElement(LinkedHashSet<Integer> a,int value) {
        boolean result = false;
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer t = iterator.next();
            if (t == value) {
                result = true;
            }
        }
        return result;

    }
}





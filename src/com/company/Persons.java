package com.company;

class Persons {
    int hight;
    private float weight;

    void say(){
        System.out.println("Oh, hello there!");
    }
    Persons(int hight, float weight){
         this.hight = hight;
         this.weight = weight;
    }
    Persons(){}
}

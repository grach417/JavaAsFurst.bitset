package com.company;

class Student extends Persons {
    int course;

    Student(int height, float weight, int course){
        super(height, weight);
        this.course = course;
    }
}

package com.company.task2;

import java.util.Random;

public abstract class Student implements Abiturient
{
    String name;

    Random rand = new Random();
    int id = rand.nextInt(1,100);

    public String getName() {
        return name;
    }

    public void SayId() {
        System.out.println("ID студента - " + id);
    }
}

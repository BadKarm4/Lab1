package com.company.task3;

import java.util.Random;

public class Инженер implements Сотрудник
{
    String name;

    Random rand = new Random();
    int number = rand.nextInt(100000,9999999);

    public Инженер(String name)
    {
        this.name = name;
    }

    public Инженер() {}

    public void SayHi()
    {
        System.out.println("Hi my name is " + getName());
    }

    public String getName() {
        return name;
    }

    public void SayNumber() {
        System.out.println("Номер сотрудника - " + number);
    }
}

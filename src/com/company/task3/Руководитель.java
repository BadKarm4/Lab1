package com.company.task3;

public class Руководитель extends Инженер
{
    public Руководитель(String name)
    {
        this.name = name;
    }

    public void SayNumber() {
        System.out.println("Номер сотрудника - " + number);
    }
}

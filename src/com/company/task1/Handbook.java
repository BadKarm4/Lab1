package com.company.task1;

import com.company.task1.Book;

public class Handbook extends Book
{
    public Handbook(String name)
    {
        this.name = name;
    }

    public void Display()
    {
        System.out.println("Эта книга - " + getName());
    }
}

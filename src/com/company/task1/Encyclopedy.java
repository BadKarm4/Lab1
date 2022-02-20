package com.company.task1;

import com.company.task1.Book;

public class Encyclopedy extends Book
{
    public Encyclopedy(String name)
    {
        this.name = name;
    }

    public void Display()
    {
        System.out.println("Эта книга - " + getName());
    }
}

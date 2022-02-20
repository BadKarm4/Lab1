package com.company.task5;

import java.sql.SQLOutput;

public abstract class ОбщественноеЗдание implements Здание{

    String name;
    public void Build()
    {
        System.out.println("Здание построено");
    }
    protected String getName() {
        return name;
    }
}

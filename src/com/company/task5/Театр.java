package com.company.task5;

public class Театр extends ОбщественноеЗдание{
   public Театр(String name)
   {
       this.name = name;
   }
   public void Output()
   {
       System.out.println("Это здание - " + getName());
   }

}

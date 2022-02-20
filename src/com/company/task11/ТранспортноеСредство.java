package com.company.task11;

import java.util.Date;

public abstract class ТранспортноеСредство {
    String name;
    Integer timeHour;
    Integer timeMinute;
    Float pricePerPerson;
    Float pricePerKilogram;
    Float allPrice;

    String getName() {
        return name;
    }

    Float getAllPrice()
    {
        return pricePerKilogram * pricePerPerson;
    }

    public void VehicleInformation()
    {
        System.out.println("Это транспортное средство");
    }
}

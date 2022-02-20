package com.company.task11;

public class Велосипед extends ТранспортноеСредство{
    public Велосипед(String name, Float pricePerKilogram, Float pricePerPerson) {
        this.name = name;
        this.pricePerKilogram = pricePerKilogram * 1.2f;
        this.pricePerPerson = pricePerPerson * 1.2f;
        this.timeHour = 8;
        this.timeMinute = 40;
    }

    @Override
    public void VehicleInformation() {
        System.out.println("Это " + getName());
        System.out.println("Общая стоимость поездки: " + + getAllPrice());
        System.out.println("Время поездки: " + timeHour + ":" + timeMinute);
    }
}

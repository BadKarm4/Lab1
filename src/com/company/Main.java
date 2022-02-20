package com.company;

import com.company.task1.*;
import com.company.task2.*;
import com.company.task3.*;
import com.company.task4.*;
import com.company.task5.*;
import com.company.task6.*;
import com.company.task7.*;
import com.company.task8.*;
import com.company.task9.*;
import com.company.task10.*;
import com.company.task11.*;
import com.company.task12.*;
import com.company.task13.*;
import com.company.task14.*;
import com.company.task15.*;
import com.company.task16.*;
import com.company.task17.*;

import java.util.Objects;

public class Main
{
    public static void main(String[] args)
    {
        //ЗАДАНИЕ 1
        /*
        Handbook handbook = new Handbook("Справочник");
        handbook.Display();
        Encyclopedy encyclopedy = new Encyclopedy("Энциклопедия");
        encyclopedy.Display();
        */

        //ЗАДАНИЕ 2
        /*
        StudentOfFaculty student1 = new StudentOfFaculty("Влад");
        student1.SayName();
        student1.SayId();
        */

        //ЗАДАНИЕ 3
        /*
        Сотрудник руководитель = new Руководитель("Владислав");
        руководитель.SayHi();
        руководитель.SayNumber();

        Сотрудник инженер = new Инженер("Влад");
        инженер.SayHi();
        инженер.SayNumber();
        */

        //ЗАДАНИЕ 4
        /*
        Колледж колледж = new Колледж();
        колледж.SayNumber();
        Университет университет = new Университет();
        университет.SayNumber();
        */

        //ЗАДАНИЕ 5
        /*
        Театр театр = new Театр("Театр оперы и балета");
        театр.Build();
        театр.Output();
        */

        //ЗАДАНИЕ 6
        /*
        Model model = new Model("Т2400Ф");
        model.SayModelName();
        */

        //ЗАДАНИЕ 7
        /*
        Авианосец корабль1 = new Авианосец();
        корабль1.Выстрелить();
        корабль1.ВыпуститьРакету();
        */

        //ЗАДАНИЕ 8
        /*
        Хирург врач1 = new Хирург();
        Хирург врач2 = new Нейрохирург();
        врач1.ShowType();
        врач2.ShowType();
        */

        //ЗАДАНИЕ 9
        /*
        ГрузовойКорабль танкер1 = new ГрузовойКорабль();
        ГрузовойКорабль танкер2 = new Танкер();
        танкер1.ПеревезтиГруз();
        танкер2.ПеревезтиГруз();
        */

        //ЗАДАНИЕ 10
        /*
        Файл файл = new Файл("Java.txt");
        файл.Information();
        */

        //ЗАДАНИЕ 11
        /*
        Автомобиль автомобиль1 = new Автомобиль("Автомобиль",30.3f, 20.6f);
        Велосипед велосипед1 = new Велосипед("Велосипед", 20.5f, 30.5f);
        Повозка повозка1 = new Повозка("Повозка", 15.5f, 40.0f);
        ТранспортноеСредство Array[] = {автомобиль1,велосипед1,повозка1};
        for (int i = 0; i < Array.length; i++)
        {
            Array[i].VehicleInformation();
            System.out.println("-----------------------------------");
        }
        */

        //ЗАДАНИЕ 12
        /*
        Автомобиль1 автомобиль2 = new Автомобиль1("Москва", "Бишкек");
        Самолет самолет2 = new Самолет("Ош", "Бишкек");
        Поезд поезд2 = new Поезд("Магадан", "Бишкек");
        Грузоперевозчик Array1[] = {автомобиль2,самолет2,поезд2};
        for (int i = 0; i < Array1.length; i++)
        {
            Array1[i].SetPrice();
            Array1[i].Show();
            System.out.println("-----------------------------------");
        }
        */

        //ЗАДАНИЕ 13
        /*
        Школьник школьник1 = new Школьник("Влад", "Школьник", 1122);
        Школьник школьник2 = new Школьник("Вова", "Школьник", 1212);
        Студент студент1 = new Студент("Паша", "Студент", 1234);
        Учащийся Array2[] = {школьник1,студент1,школьник2};
        for (int i = 0; i < Array2.length; i++)
        {
            if (Array2[i].getType() == "Школьник")
            {
                System.out.println("Этот учащийся - " + Array2[i].getType() + " и его имя - " + Array2[i].getName());
            }
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < Array2.length; i++)
        {
            if (Array2[i].getType() == "Студент")
            {
                System.out.println("Этот учащийся - " + Array2[i].getType() + " и его имя - " + Array2[i].getName());
            }
        }
        */

        //ЗАДАНИЕ 14
        /*
        Духовой флейта = new Духовой();
        Струнный скрипка = new Струнный();
        Ударный барабаны = new Ударный();
        МузыкальныйИнструмент Array3[] = {флейта,скрипка,барабаны};
        System.out.println("Состав оркестра");
        for (int i = 0; i < Array3.length; i++)
        {
            Array3[i].Sound();
        }
        */

        //ЗАДАНИЕ 15
        /*
        Тестировщик тестировщик = new Тестировщик("Владислав", "Тестировщик");
        Программист программист = new Программист("Антон", "Программист");
        Менеджер менеджер = new Менеджер("Слава", "Менеджер");
        Дизайнер дизайнер = new Дизайнер("Маша", "Дизайнер");
        Аналитик аналитик = new Аналитик("Семен", "Аналитик");
        РаботникФирмы Array4[] = {тестировщик,программист,менеджер,дизайнер,аналитик};
        for (int i = 0; i < Array4.length; i++)
        {
            Array4[i].SayYourJob();
        }
        */

        //ЗАДАНИЕ 16
        /*
        Попугай попугай = new Попугай("Вася", 5);
        Собака собака = new Собака("Бобик", 3);
        Кошка кошка = new Кошка("Маруся", 9);
        ДомашнееЖивотное Array5[] = {кошка,собака,попугай};
        for (int i = 0; i < Array5.length; i++)
        {
            Array5[i].Information();
        }
        */

        //ЗАДАНИЕ 17
        /*
        Вишня вишня = new Вишня(1,13,2);
        Слива слива = new Слива(2,8, 2);
        Яблоня яблоня = new Яблоня(3,14,5);
        Вишня вишня1 = new Вишня(4,5,5);
        СадовоеДерево Array6[] = {вишня,слива,яблоня,вишня1};
        for (int i = 0; i < Array6.length; i++)
        {
            System.out.print("Дерево под номером " + Array6[i].getNumber() + ", ");
            Array6[i].Inf();
        }
        */
    }
}

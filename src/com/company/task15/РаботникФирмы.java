package com.company.task15;

import com.company.task8.Хирург;

public abstract class РаботникФирмы {
    String type;
    String name;

    public void SayYourJob()
    {
        System.out.println("Я " + name + " и я " + type);
    }
}

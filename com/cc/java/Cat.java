package com.cc.java;

public class Cat 
{

    String name;
    String furColor;
    int age;

    public String tellYourName()
    {
        return this.name;
    }

    public String tellYourFur()
    {
        return this.furColor;
    }

    public int tellYourAge()
    {
        return this.age;
    }


    void tellYourAddress()
    {
        System.out.println(this);
    }
}

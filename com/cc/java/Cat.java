package com.cc.java;

public class Cat // public im Klassendiegramm ein "+"
{

    private String name; // privat ---> im Klassendiagramm ein "-"
    private String furColor;
    private int age;


    public Cat(String name, String furColor, int age)
    {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String getName()
    {
        if (getPermission())
        {
            return name;
        } 
        else 
        {
            return "Sorry<3, no permission!";
        }
        
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getFurColor()
    {
        return furColor;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    private boolean getPermission()
    {
        return true;
    }

}

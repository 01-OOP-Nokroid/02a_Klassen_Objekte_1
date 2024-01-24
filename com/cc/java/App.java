package com.cc.java;

public class App {
    
    public static void main(String[] args)
    {
        // Objekt ensteht...
        Cat cat = new Cat(); // Instanzierung
        System.out.println(cat);


        // Wertzuweisung
        cat.name = "Alonzo";
        cat.furColor = "grey";
        cat.age = 35;

        // Ausgabe
        System.out.println(cat.tellYourName());
        System.out.println(cat.tellYourFur());
        System.out.println(cat.tellYourAge());

        System.out.println("------------");

        Cat cat2 = new Cat();
        System.out.println(cat2);

        // Wertzuweisung
        cat2.name = "Gizabella";
        cat2.furColor = "White";
        cat2.age = 29;

        // Ausgabe
        System.out.println(cat2.name);
        System.out.println(cat2.furColor);
        System.out.println(cat2.age);
    }

   

}


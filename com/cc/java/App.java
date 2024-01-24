package com.cc.java;

public class App {
    
    public static void main(String[] args)
    {
        // Objekt ensteht...
        Cat cat = new Cat(); // Instanzierung
        output("Adresse des Objektes: " + cat);


        // Wertzuweisung
        cat.name = "Alonzo";
        cat.furColor = "grey";
        cat.age = 35;

        // Ausgabe
        output(cat.tellYourName());
        output(cat.tellYourFur());
        output(String.valueOf(cat.tellYourAge())); // int ---> String



        // System.out.println(cat.tellYourName());
        // System.out.println(cat.tellYourFur());
        // System.out.println(cat.tellYourAge());

        // output("hi");

        System.out.println("------------");

        Cat cat2 = new Cat();
        System.out.println(cat2);

        // Wertzuweisung
        cat2.name = "Gizabella";
        cat2.furColor = "White";
        cat2.age = 29;

        // Ausgabe
        output(cat2.tellYourName());
        output(cat2.tellYourFur());
        output(Integer.toString(cat2.tellYourAge()));



        // System.out.println(cat2.name);
        // System.out.println(cat2.furColor);
        // System.out.println(cat2.age);
    }

   // statische Methode --- in Klasse
    public static void output(String outpuString){
        System.out.println(outpuString);
    }
}


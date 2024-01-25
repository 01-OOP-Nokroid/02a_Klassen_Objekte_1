package com.cc.java;

public class App {
    
    public static void main(String[] args)
    {
        // Objekt ensteht...
        Cat cat = new Cat("Alonzo","grey", 35); // Instanzierung

        // Ausgabe
        output(cat.getName());
        output(cat.getFurColor());
        output(String.valueOf(cat.getAge())); // int ---> String



        // output(cat.name);

        System.out.println("------------");

        Cat cat2 = new Cat("Grizabelle","White", 29);

        // cat2.furColor = "grey";

        // Ausgabe
        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));

    }

   // statische Methode --- in Klasse
    public static void output(String outpuString){
        System.out.println(outpuString);
    }
}


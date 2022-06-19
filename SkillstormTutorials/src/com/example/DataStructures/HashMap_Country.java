package com.example.DataStructures;

import java.util.HashMap;

public class HashMap_Country {
    public static void main(String[] args) {
        //High-performance way of accessing elements based on a key...Search
        HashMap<String, Citizen> citizens = new HashMap<>();
            citizens.put("5001", new Citizen("Brian"));
            citizens.put("4524", new Citizen("Diane"));
        System.out.println(citizens.get("5001").name); //prints Brian
            citizens.put("5001", new Citizen("Ryan"));
        System.out.println(citizens.get("5001").name); //Overwrites and prints Ryan
            citizens.size(); //number of key-value
        System.out.println(citizens.size()); //prints 2 because 5001 was overwritten
            citizens.containsKey("5001"); //true
            citizens.containsValue("Brian");//false because brian overwritten
            citizens.entrySet(); //SSN, Citizen
            citizens.keySet(); //L4 of SSN
            citizens.values(); //citizens
    }
}
class Citizen{
    String name;
    public Citizen(String name){
        this.name = name;
    }
}

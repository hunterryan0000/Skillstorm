package com.example.OOP;

public class Inheritance_Farmer {
    public static void main(String[] args) {
        Pickle pickle = new Pickle();
        pickle.grow(); // pickle extends cucumber so has access to grow method
    }
}

class Cucumber {
    double calories;

    public void grow(){}
}

class Pickle extends Cucumber {
    public Pickle() {
        calories = calories * 0.70; // inherits the properties of Cucumber
    }
}
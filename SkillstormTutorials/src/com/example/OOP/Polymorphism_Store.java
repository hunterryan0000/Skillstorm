package com.example.OOP;

public class Polymorphism_Store {
    public static void main(String[] args) {
        Furniture chair = new Chair(); // reference type is Furniture object type is Chair
        Furniture table = new Table();
    }
}
class Furniture{ }
class Chair extends Furniture{}
class Table extends Furniture{}
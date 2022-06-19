package com.example.OOP;

public class Abstraction {
    public static void main(String[] args) {
//        Shape shape = new Shape();
// cannot instantiate because Shape class is abstract
    }
}
abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
   @java.lang.Override
    double area() {
        return 0;
    }
}
class Square extends Shape {
    @java.lang.Override
    double area() {
        return 10;
    }
}

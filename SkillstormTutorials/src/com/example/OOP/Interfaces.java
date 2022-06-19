package com.example.OOP;

public class Interfaces {
    public static void main(String[] args) {

    }
}
interface Drawable {
    public abstract void draw();
}
class Rectangle implements Drawable{
    @java.lang.Override
    public void draw() {} //must implement to be Drawable or error occurs
}
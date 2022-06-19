package com.example.ProgrammingInJava;

public class DoWhile {
    public static void main(String[] args) {
        loop(false); //prints "Running" once
    }
    static void loop(boolean running){
        do { //ensures loop happens at least once
            System.out.println("Running");
        } while (running);
    }
}

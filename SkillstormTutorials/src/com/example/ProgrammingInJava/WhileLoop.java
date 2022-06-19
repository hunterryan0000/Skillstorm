package com.example.ProgrammingInJava;

public class WhileLoop {
    public static void main(String[] args) {
        Loop(); //call method
    }
    static void Loop(){ //create method
        boolean running = check(); //running = boolean method
        while (running){ //while loop creates conditional loop
            System.out.println("running"); //prints "running"
            running = check(); // boolean variable = method's boolean

        }
    }
    static boolean check(){ //created the check method
        if(Math.random() < 0.5){ //generates random num 0-1
            return false; // if num generated is less than 0.5 loop stops
        } else {
            return true; // if num is greater than 0.5 loop runs and continues
        }
    }
}

package com.example.ProgrammingInJava;

public class ForLoop {
    public static void main(String[] args) {
        loop(10); //prints 123456789
    }
    static void loop(int max){
        //counter variable; condition; increment
        for (int i = 0; i < max; i++) {
            System.out.println(i); //prints until 10<10 false
        }
    }
}

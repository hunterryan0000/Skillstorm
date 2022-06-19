package com.example.ProgrammingInJava;

public class IfElse {
    public static void main(String[] args) {
        branch(true);
        branch(false);
    }
    static void branch(boolean cond){
        if(cond){
            System.out.println("The condition is true");
        } else{
            System.out.println("The condition is false");
        }
    }
}

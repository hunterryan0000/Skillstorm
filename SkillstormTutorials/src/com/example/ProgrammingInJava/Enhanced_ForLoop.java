package com.example.ProgrammingInJava;

public class Enhanced_ForLoop {
    public static void main(String[] args) {
        Loop(new int[]{1,2,3,4,5}); //prints 1,2,3,4,5 vertically
    }
    static void Loop(int[] array){
        for (int i : array){ //for each int in array
            System.out.println(i);
        }
    }
}

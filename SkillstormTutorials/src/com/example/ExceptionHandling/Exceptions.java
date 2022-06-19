package com.example.ExceptionHandling;

public class Exceptions {
    public static void main(String[] args) {
        /**Unchecked Exceptions**/ //compiles w/ no (red) errors
        int x = 5/0; //produces ArithmeticException at runtime

        Object obj = null;
        obj.toString(); //NullPointerException for
//        calling a method on an object that hasn't been initialized
        /**Checked Exception**/ //doesn't compile & shows error
        // FileInputStream file = new FileInputStream("file.txt");
    }
}

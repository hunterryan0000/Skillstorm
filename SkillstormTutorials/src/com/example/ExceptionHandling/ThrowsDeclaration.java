package com.example.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDeclaration {
    public static void main(String[] args) {
//        read(); //handle somewhere else
    }
    static void read() throws FileNotFoundException {
        //declared the exception, and can now compile
        FileInputStream file = new FileInputStream("file.txt");
    }
}

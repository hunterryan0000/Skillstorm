package com.example.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {
    public static void main(String[] args) {
        FileInputStream f = null;
        try {
            f = new FileInputStream("demo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally { // will always execute
            if (f != null){//f could get NullPointerException
                try{
                    f.close(); //throws IOException...surround w/ try/catch
                } catch (IOException e){}
            }
        }
    }
}

package com.example.ExceptionHandling;

import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            process();
            //Specialized ex first --> more generalized (e.g.Exception)
        } catch (ExecutionException | DataFormatException x){
            //same code
        }
    }
    static void process() throws DataFormatException, ExecutionException{
        //code
    }
}

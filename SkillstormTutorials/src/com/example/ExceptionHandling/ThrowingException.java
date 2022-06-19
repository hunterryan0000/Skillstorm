package com.example.ExceptionHandling;

public class ThrowingException {
    public static void main(String[] args) {
//        pull(); //Have to handle checked exception
    }
// use throws declaration so anyone who uses method has to handle the exception
    static void pull() throws DeploymentException{ //uses throws
        if (Math.random() < 0.001) {
            throw new DeploymentException(); //uses throw inside method
        }
    }
}
class DeploymentException extends Exception{}

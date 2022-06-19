package com.example.DataStructures;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>(); //default size is 16, grows 50% in size w/ each added element
        list.add("abc");
        list.add("def");
        System.out.println(list.get(1)); //prints def
        System.out.println(list); //prints [abc, def]
        for(String i: list) {
            System.out.print(i); //prints abcdef
        }
    }
}

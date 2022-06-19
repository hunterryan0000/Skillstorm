package com.example.DataStructures;

import java.util.Stack;

public class Stack_Casino {
    public static void main(String[] args) {
        Stack<Card> stack = new Stack<>();
        stack.push(new Card("A of Spades")); //adds card to stack
        stack.push(new Card("K of Diamonds"));//adds card to stack
        stack.push(new Card("Q of Hearts")); //adds card to stack
        System.out.println(stack.pop().value); //prints (removes!) Q of Hearts
        System.out.println(stack.peek().value); //prints K of Diamonds
    }
}

class Card{
    String value;
    public Card(String value){
        this.value = value;
    }
}

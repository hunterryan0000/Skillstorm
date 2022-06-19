package com.example.DataStructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Checkout {
    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue<>(); //Priority puts queue in some type of order
        queue.offer(new Person()); //adds person/pushes to tail
        queue.peek();//check for what's at the head
        System.out.println(queue.poll()); //pop the head of the queue
        System.out.println(queue.size()); //prints 0
    }
}
class Person{}

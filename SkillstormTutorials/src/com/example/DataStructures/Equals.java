package com.example.DataStructures;

import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        Pizza one = new Pizza();
        one.size = 14;
        one.topping = "pepperoni";
        Pizza two = new Pizza();
        two.size = 14;
        two.topping = "cheese";
        //one = two; //makes hashcode equal
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        //hashcodes are diff
    }
}
class Pizza{
    int size = 0; //used twice because two pizzas were created
    String topping = null; //used twice because two pizzas were created

    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return size == pizza.size && topping.equals(pizza.topping);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(size, topping);
    }
}


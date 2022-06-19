package com.example.DataStructures;

import java.util.HashSet;
import java.util.Objects;

public class Set_Party {
    public static void main(String[] args) {
        HashSet<Friend> friends = new HashSet<>();
        friends.add(new Friend("Dan", 24));
        friends.add(new Friend("Diana", 41));
        // hashcode/equals memory location by default
        friends.add(new Friend("Dan", 24));
        System.out.println(friends);//prints [Dan 24, Diana 41]
    }
}
class Friend{
    String name;
    int age;
    Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    @java.lang.Override
    public boolean equals(Object o) { //generate equals and hashcode
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return age == friend.age && Objects.equals(name, friend.name);
    }

    @java.lang.Override
    public int hashCode() { //generate equals and hashcode
        return Objects.hash(name, age);
    }

    public String toString(){ //method turns params into Strings
        return name + " " + age;
    }

}
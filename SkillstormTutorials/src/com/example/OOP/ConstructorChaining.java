package com.example.OOP;

 class Chaining {
    public static void main(String[] args) {
        JavaDeveloper dev = new JavaDeveloper("Java"); // calls constructor with variable
    }
}
class Employee {
    String name = "Ryan Hunter";
    public Employee () {
        System.out.println("Employee");
    }
}
class JavaDeveloper extends Employee {
    String language;
    public JavaDeveloper(){
        super(); // default...happens without code...prints "Employee"
        System.out.println("JavaDeveloper");
    }
    public JavaDeveloper(String language) {
        this(); // prints "JavaDeveloper"
        this.language = language;
        System.out.println(language); //prints "Java"
    }
}

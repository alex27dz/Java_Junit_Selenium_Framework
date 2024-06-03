package com.eviltester.webdriver;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        datatypes();
        ifelse();
    }
    public static void datatypes() {
        int age = 30; // integer
        double salary = 50000.50; // double
        char grade = 'A'; // character
        String name = "Alice"; // string
        boolean isEmployed = true; // boolean
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
    }
    public static void ifelse() {
        int age = 18;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
    public static void forloop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }
    }

    public static void whileloop() {
        int i = 0;
        while (i < 5) {
            System.out.println("Count: " + i);
            i++;
        }
    }






}


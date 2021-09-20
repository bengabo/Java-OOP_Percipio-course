package com.example;

public class Greet {
    private String greeting;
    private String recipient;

    public Greet() {
        greeting = "Hello";
        recipient = "World";
    }

    public void printGreeting() {
        System.out.println(greeting + ", " + recipient);
    }
}

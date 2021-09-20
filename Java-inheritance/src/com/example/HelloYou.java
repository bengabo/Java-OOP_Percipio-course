package com.example;

public class HelloYou {
    private String you;

    public HelloYou(String recipient){
        you = recipient;
    }

    public void printHello(){
        System.out.println("Hello " + you + "!");
    }
}

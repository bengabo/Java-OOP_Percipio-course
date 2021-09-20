package com.example;

public class Main {

    public static void main(String[] args){
       // LogFile log = new HTTPLogFile("wamwam.com");

        // System.out.println(log.filname); /*Cannot access to a private member */
        // log.writeLog("index.html - 200 OK 192.168.2.1");

        Path rectPath = new RectanglePath(3.0, 4.0);
        System.out.println("Rectangle path (perimeter) = " + rectPath.distance());

        Path circPath = new CirclePath(5.0);
        System.out.println("Circle path (circumference) = " + circPath.distance());
    }

}

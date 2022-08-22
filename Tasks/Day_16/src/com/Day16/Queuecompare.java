package com.Day16;
import java.util.PriorityQueue;

public class Queuecompare {
    public static void main(String[] args) {
        PriorityQueue<String> p1 = new PriorityQueue<>();
        p1.add("One");
        p1.add("Two");
        p1.add("Three");
        p1.add("Four");

        System.out.println("First Priority Queue:" +p1);

        PriorityQueue<String> p2 = new PriorityQueue<>();
        p2.add("Five");
        p2.add("One");
        p2.add("Four");
        p2.add("seven");

        System.out.println("Second Priority queue:" +p2);

        for(String n: p1){
            System.out.println(p2.contains(n) ? "Contains same element" : "Different element");
        }
    }
}

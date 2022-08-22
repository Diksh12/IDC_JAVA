package com.Day16;
import java.util.PriorityQueue;

public class pp {

        public static void main(String[] args) {
            PriorityQueue<Integer> p1 = new PriorityQueue<>();
            p1.add(1);
            p1.add(2);
            p1.add(3);
            p1.add(4);

            System.out.println("First Priority Queue:" +p1);

            PriorityQueue<Integer> p2 = new PriorityQueue<>();
            p2.add(5);
            p2.add(2);
            p2.add(4);
            p2.add(7);

            System.out.println("Second Priority queue:" +p2);

            for(Integer n: p1){
                System.out.println(p2.contains(n) ? "Contains same element" : "Different element");
            }
        }
    }



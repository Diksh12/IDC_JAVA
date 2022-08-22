package com.Day16;

import java.util.ArrayList;

class Day22 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}
class Good extends Thread {
    public void run() {
        System.out.println("Good morning");
    }
}
public class Delay {
    public static void main(String[] args) {
        Day22 t1= new Day22();
        Good t2= new Good();
        t1.start();
        t2.start();
    }
}

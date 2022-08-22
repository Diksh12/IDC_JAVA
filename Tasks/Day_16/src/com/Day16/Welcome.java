package com.Day16;

import java.util.ArrayList;

class Diksh1 extends Thread{
    public void run(){
        while (true){
            System.out.println("Welcome");
        }
    }
}
class Diksh2 extends Thread {

    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}
public class Welcome {
    public static void main(String[] args) {
        Diksh1 t1= new Diksh1();
        Diksh2 t2= new Diksh2();
        t1.start();
        t2.start();
    }
}

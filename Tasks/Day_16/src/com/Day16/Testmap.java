package com.Day16;
import java.util.*;
import java.util.HashMap;

public class Testmap {
    public static void main(String[] args) {
        HashMap<String, Integer> h1 = new HashMap<String, Integer>();

        h1.put("Dikshita", 1);
        h1.put("Unnati", 2);
        h1.put("Sunita", 3);
        h1.put("Dipti", 4);

        System.out.println("Hashmap:" +h1);

        System.out.println("Unnati is there ?" + h1.containsKey("Unnati"));
        System.out.println("Rudresh is there ?" + h1.containsKey("Rudresh"));


    }
}

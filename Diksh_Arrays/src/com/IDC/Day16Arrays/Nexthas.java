package com.IDC.Day16Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Nexthas {
    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>();

        countryList.add("India");
        countryList.add("USA");
        countryList.add("Japan");
        countryList.add("Canada");

        Iterator iterator = countryList.iterator();

        System.out.println("Countries: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

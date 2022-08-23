package com.IDC.Day16Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;


public class abcde {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("A");
        words.add("B");
        words.add("C");
        words.add("D");
        words.add("E");

        ListIterator iterator = words.listIterator();

        System.out.println("Displaying elements in forward order: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Displaying elements in backward direction:");

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();
    }

}

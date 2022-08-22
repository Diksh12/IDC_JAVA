package com.Day16;
import java.util.*;

public class Garray {

    public static <E> void printArray(E[] inputArray) {

        for (E element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }

    public static void main(String args[]) {

        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'D', 'I', 'K', 'S', 'H' };
        Byte[] barry = {7, 8, 9, 10};

        System.out.println("Integer Array contains:");
        printArray(integerArray);
        System.out.println("\nDouble Array contains:");
        printArray(doubleArray);
        System.out.println("\nCharacter Array contains:");
        printArray(characterArray);
        System.out.println("\nByte Array contains:");
        printArray(barry);
    }
}
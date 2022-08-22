//Tree set clone

package com.Day16;
import java.util.*;
import java.util.TreeSet;

public class ConvertTree {
    public static void main(String[] args) {
        TreeSet<Integer> Treeconvert = new TreeSet<>(Arrays.asList(10,20,30,40,50));
        TreeSet<Integer> Dikshita = new TreeSet<>();

        System.out.println("Tree set elements:" +Treeconvert);

        Dikshita = (TreeSet<Integer>)Treeconvert.clone();

        System.out.println("Tree set elements after cloning" +Dikshita);

    }
}

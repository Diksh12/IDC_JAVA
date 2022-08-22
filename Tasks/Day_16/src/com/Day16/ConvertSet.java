//Hash_Set

package com.Day16;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class ConvertSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Hash set contains:" +numbers);

        Integer arr[] = new Integer[numbers.size()];

        numbers.toArray(arr);


            System.out.print("After converting hash set to array:" + Arrays.toString(arr));





    }
}

//Linked_List

package com.Day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class InsertElement {
    public static void main(String[] args) {
        LinkedList nElement = new LinkedList(Arrays.asList(4,10,15,20,25,35));

        System.out.println(nElement);

        nElement.addFirst(5);
        nElement.addLast(30);

        System.out.print(nElement);

    }
}

//Array_List

package com.Day16;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class UpdateElement {
    public static void main(String[] args) {

        ArrayList<String>  elements = new ArrayList<>();

        elements.add("Dikshita");
        elements.add("Manohar");
        elements.add("Sunita");
        elements.add("Rudresh");
        elements.add("Nilesh");

        System.out.println(elements);

        elements.set(4, "Unnati");

        System.out.println(elements);

    }
}

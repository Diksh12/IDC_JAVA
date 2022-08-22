package com.Day16;

import java.util.Comparator;
import java.util.TreeMap;

public class LastOne {

    public static void main(String args[]){

        TreeMap<String, String> end = new TreeMap<String, String>(new MyComp());

        end.put("Emp1", "101");
        end.put("Emp2", "103");
        end.put("Emp3","102");
        end.put("Emp4", "104");
        System.out.println(end);
    }
}

class MyComp implements Comparator<String>{

    @Override
    public int compare(String str1, String str2) {

        return str1.compareTo(str2);

    }

}

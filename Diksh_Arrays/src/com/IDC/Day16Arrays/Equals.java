package com.IDC.Day16Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Equals {
    public static void main(String[] args) {
        ArrayList<Emp> list = new ArrayList<Emp>();
        list.add(new Emp(121, "Dikshita"));
        list.add(new Emp(122, "Shreya"));
        list.add(new Emp(123, "Harry"));
        list.add(new Emp(121, "Dikshita"));

        System.out.println(list.size());

        Emp emp = new Emp(121, "Dikshita");
        list.remove(emp);

        System.out.println(list.size());
    }
}

class Emp {
    int id;
    String name;

    Emp(int id, String name){
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj){
        if (obj instanceof Emp) {
            Emp emp = (Emp)obj;
            if (emp.id == this.id && emp.name.equals(this.name))
                return true;
        }
        return false;
    }

}
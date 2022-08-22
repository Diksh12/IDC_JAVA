package com.Day16;
import java.util.Arrays;
import java.util.List;

public class GenAddno {

        public static double sum(List<? extends Number> numberlist) {
            double sum = 0.0;
            for (Number n : numberlist) sum += n.doubleValue();
            return sum;
        }

        public static void main(String args[]) {
            List<Integer> integerList = Arrays.asList(12, 2, 36);
            System.out.println("sum = " + sum(integerList));

            List<Double> doubleList = Arrays.asList(4.2, 2.6, 3.9);
            System.out.println("sum = " + sum(doubleList));
        }

}

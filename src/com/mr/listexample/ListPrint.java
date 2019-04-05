package com.mr.listexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListPrint {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,34,5,6);

        System.out.println("Before sorting");
        list.forEach(l ->{
            System.out.println(l);
        });

        list.sort(Comparator.naturalOrder());
        System.out.println("After sorting");
        list.forEach(l->{
            System.out.println(l);
        });
    }
}

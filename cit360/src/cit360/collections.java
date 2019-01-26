/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Sandbox
 * @author Drago
 */
public class collections {
    
//    public static void main(String[] args) {
//
//        // create a list using the
//        List<String> list = Arrays.asList("Lars", "Simon");
//
//        // alternatively
//        List<String> anotherList = new ArrayList<>();
//        anotherList.add("Lars");
//        anotherList.add("Simon");
//
//
//        // print each element to the console using method references
//        list.forEach(System.out::println);
//        anotherList.forEach(System.out::println);

    
    
    public static void main(String[] args) {
        // use type inference for ArrayList
        List<Integer> list = Arrays.asList(3,2,1,4,5,6,6);
        
        // alternative you can declare the list via:
        // List<Integer> list = new ArrayList<>();
        // and use list.add(element); to add elements
        list.forEach((integer) -> {
            System.out.println(integer);
        });
        
        int series = 0;
        int[] arra = {1, 2, 3, 4};
        for (int i = 0; i < arra.length; i++) {
            series = series + arra[i];
            System.out.println("series" + series);
    }
    
    
        System.out.println("Sorting with natural order");
        List<String> l1 = createList();
        l1.sort(null);
        l1.forEach(System.out::println);

        System.out.println("Sorting with a lamba expression for the comparison");
        List<String> l2 = createList();
        l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));  // sort ignoring case
        l2.forEach(System.out::println);

        System.out.println("Sorting with a method references");
        List<String> l3 = createList();
        l3.sort(String::compareToIgnoreCase);
        l3.forEach(System.out::println);

    }

    private static List<String>  createList() {
        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
    }
    
    
}

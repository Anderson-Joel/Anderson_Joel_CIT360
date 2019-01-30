/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sandbox
 * @author Drago
 */
public class stringList {
    public static void main(String[] args) {

        // create a list using the
        System.out.println("Actual asList is 3");
        List<String> list = Arrays.asList("Peter", "James", "John");

        // alternatively
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Lars");
        anotherList.add("Simon");
        anotherList.add("Anderson");


        // print each element to the console using method references
        list.forEach(System.out::println);
        anotherList.forEach(System.out::println);
    }
}

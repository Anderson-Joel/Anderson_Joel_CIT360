/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.Arrays;
import java.util.List;

/**
 * Sandbox
 * @author Drago
 */
public class stringInteger {
    public static void main(String[] args) {
        // use type inference for ArrayList
        List<Integer> list = Arrays.asList(3,2,1,4,5,6,6,10,45,15);
        
        // alternative you can declare the list via:
        // List<Integer> list = new ArrayList<>();
        // and use list.add(element); to add elements
        list.forEach((integer) -> {
            System.out.println(integer);
        });
    }
}

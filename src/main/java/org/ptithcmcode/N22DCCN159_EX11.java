package org.ptithcmcode;

import java.util.LinkedList;
import java.util.Random;
import java.util.TreeMap;

public class N22DCCN159_EX11 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMapStudents = new TreeMap<>();
        
        for(int i = 0; i < 10; i++) {
            treeMapStudents.put("N22DCCN" + (new Random().nextInt(1000) + 1000), "Student " + i);
        }
        for(var keyIt: treeMapStudents.keySet()) {
            System.out.println(keyIt);
        }
        
        for(var valueIt: treeMapStudents.values()) {
            System.out.println(valueIt);
        }
        
        System.out.println(treeMapStudents.firstKey());
        System.out.println(treeMapStudents.lastKey());
        
        
    }
}


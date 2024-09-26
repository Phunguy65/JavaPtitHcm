package org.ptithcmcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * J07004:
 * @author PNguyen 
 * Cho file văn bản DATA.in có không quá 100000 số nguyên dương, giá trị các số nhỏ hơn 1000.
 *
 * Hãy liệt kê các số khác nhau xuất hiện trong file và số lần xuất hiện của từng số đó. 
 */
public class J07004 {
    
    // read file DATA.in
    
    public static void main(String[] args){
        File file = new File("DATA.in");
        
        try (Scanner sc = new Scanner(file)) {
            Map<Integer, Integer> map = new HashMap<>();
            while(sc.hasNextInt()){
                int key = sc.nextInt();
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            
            map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



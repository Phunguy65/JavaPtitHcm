package org.ptithcmcode;

import java.util.ArrayList;

/**
 * J02006:
 * Cho dãy số a[] có n phần tử và dãy số b[] có m phần tử là các số nguyên dương nhỏ hơn 1000. 
 * Gọi tập hợp A là tập các số khác nhau trong a[], 
 * tập hợp B là tập các số khác nhau trong b[].
 * Hãy tìm hợp của A và B
 */
public class J02006 {
    
    private static void findUnionHashSet(java.util.Set<Integer> a, java.util.Set<Integer> b) {
        java.util.HashSet<Integer> result = new java.util.HashSet<>(a);
        
        result.addAll(b);
        
        ArrayList<Integer> list = new ArrayList<>(result);
        
        java.util.Collections.sort(list);
        
        for(Integer x : list) {
            System.out.print(x + " ");
        }
        
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();
            
            java.util.Set<Integer> a = new java.util.HashSet<>();
            java.util.Set<Integer> b = new java.util.HashSet<>();
            
            for(int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            
            for(int i = 0; i < m; i++) {
                b.add(sc.nextInt());
            }
            
            findUnionHashSet(a, b);
        
        sc.close();
    }
}

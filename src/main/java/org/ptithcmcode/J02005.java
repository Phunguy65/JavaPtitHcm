package org.ptithcmcode;

import java.util.HashSet;
import java.util.Set;

/**
 * J02005:
 * Cho dãy số a[] có n phần tử và dãy số b[] có m phần tử là các số nguyên dương nhỏ hơn 1000. Gọi tập hợp A là tập các số khác nhau trong a[], tập hợp B là tập các số khác nhau trong b[].
 * Hãy tìm tập giao của A và B. 
 */
public class J02005 {
    private static void findAssignHashSet(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        
        result.retainAll(b);
        
        for(Integer x : result) {
            System.out.print(x + " ");
        }
        
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();
            
            Set<Integer> a = new HashSet<>();
            Set<Integer> b = new HashSet<>();
            
            for(int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            
            for(int i = 0; i < m; i++) {
                b.add(sc.nextInt());
            }
            
            findAssignHashSet(a, b);
        
        sc.close();
    }
}

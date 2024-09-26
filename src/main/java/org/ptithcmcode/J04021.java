package org.ptithcmcode;

import java.util.ArrayList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * J04021:
 * @author PNguyen
 * 
 * Trong lý thuyết tập hợp, một tập hợp chỉ được phép chứa các giá trị phân biệt và luôn luôn lưu các giá trị theo thứ tự tăng dần.
 *
 * Khai báo lớp IntSet và viết các phương thức để thực hiện các thao tác trên tập hợp số nguyên. Sử dụng lớp IntSet để in ra tập hợp các số nguyên là hợp của hai tập số trong 2 dãy ban đầu.
 *
 * Chú ý viết hàm main đúng theo mẫu. 
 * 
 */
public class J04021 {
    
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int n = sc.nextInt();
            
            ArrayList<Integer> listA = new ArrayList<>();
            
            for(int i = 0; i < n; i++) {
                listA.add(sc.nextInt());
            }
            
            n = sc.nextInt();
            
            ArrayList<Integer> listB = new ArrayList<>();
            
            for(int i = 0; i < n; i++) {
                listB.add(sc.nextInt());
            }
            
            InSet inSet = new InSet(listA, listB);
            
            inSet.union();
            
        }
    }
}

class InSet{
    
    private ArrayList<Integer> listA;
    private ArrayList<Integer> listB;
    
    public InSet(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        this.listA = listA;
        this.listB = listB;
    }
    
    public void union() {
        SortedSet<Integer> set = new TreeSet<>();
        set.addAll(listA);
        set.addAll(listB);
        
        for(int i : set) {
            System.out.print(i + " ");
        }
    }
}

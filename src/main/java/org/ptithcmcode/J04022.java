package org.ptithcmcode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * J04022
 * 
 * @author PNguyen 
 * 
 * Trong lập trình cơ bản, một từ được hiểu là một dãy ký tự liên tiếp không chứa khoảng trống, dấu tab hoặc dấu xuống dòng.
 *
 *
 * Xây dựng lớp WordSet để quản lý tập hợp các từ khác nhau trong một xâu ký tự, sau khi đã chuyển hết về dạng chữ thường. Khi liệt kê thì tập từ thì sẽ luôn theo thứ tự từ điển tăng dần.
 *
 *
 *
 * Viết chương trình nhập hai dòng ký tự và hiển thị hợp và giao của hai tập từ tương ứng.
 *
 */
public class J04022 {
    
    private static void getUnion(String[] arr1, String[] arr2) {
        WordSet set1 = new WordSet(arr1);
        WordSet set2 = new WordSet(arr2);
        set1.union(set2);
    }
    
    private static void getIntersection(String[] arr1, String[] arr2) {
        WordSet set1 = new WordSet(arr1);
        WordSet set2 = new WordSet(arr2);
        set1.intersection(set2);
        System.out.println();
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String[] arr1 = sc.nextLine().toLowerCase().split("\\s+");
            String[] arr2 = sc.nextLine().toLowerCase().split("\\s+");
            getUnion(arr1, arr2);
            getIntersection(arr1, arr2);
        }
    }
}

class WordSet {
    private String[] arr;
    
    public WordSet(String[] arr) {
        this.arr = arr;
    }
    
    public TreeSet<String> getSet() {
        return new TreeSet<>(Arrays.asList(arr));
    }
    
    public void union(WordSet set) {
        TreeSet<String> unionSet = new TreeSet<>(getSet());
        unionSet.addAll(set.getSet());
        unionSet.forEach(word -> System.out.print(word + " "));
        System.out.println();
    }
    
    public void intersection(WordSet set) {
        TreeSet<String> intersectionSet = new TreeSet<>(getSet());
        intersectionSet.retainAll(set.getSet());
        intersectionSet.forEach(word -> System.out.print(word + " "));
        System.out.println();
    }
}

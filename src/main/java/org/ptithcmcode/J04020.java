package org.ptithcmcode;

/**
 * J04020:
 * @author PNguyen
 * 
 * Khai báo lớp Pair mô tả các thao tác với cặp số nguyên. Sử dụng lớp Pair để giải quyết bài toán sau (chú ý viết hàm main đúng theo mẫu).
 *
 * Nhập số tự nhiên N, hãy tìm cặp số nguyên tố đầu tiên có tổng là N.
 *
 * Nếu không tồn tại cặp số nguyên tố có tổng bằng N, hãy đưa ra -1.
 * 
 * 
 */
public class J04020 {
    
    private static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    private static Pair<Integer, Integer> findPrimePair(int n) {
        for(int i = 2; i <= n / 2; i++) {
            if(isPrime(i) && isPrime(n - i)) {
                return new Pair<>(i, n - i);
            }
        }
        return new Pair<>(-1, -1);
    }
    
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int n =sc.nextInt();
            
            while (n-- > 0) {
                Pair<Integer, Integer> pair = findPrimePair(sc.nextInt());
                
                if(pair.getFirst() == -1) {
                    System.out.println(-1);
                } else {
                    System.out.println(pair);
                }
            }
        }
    }
    
}

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
    
    @Override
    public String toString() {
        return first + " " + second;
    }
}


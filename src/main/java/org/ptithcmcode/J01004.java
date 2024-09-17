package org.ptithcmcode;

/**
 * J01004:
 * Viết chương trình kiểm tra một số nguyên dương có phải số nguyên tố hay không. 
 * Dòng đầu của dữ liệu vào ghi số bộ test. 
 * Mỗi dòng tiếp theo có một nguyên dương không quá 9 chữ số. 
 * Kết quả in ra YES nếu đó là số nguyên tố, in ra NO nếu ngược lại.
 */

public class J01004 {
    static void isPrime(long n) {
        if (n < 2) {
            System.out.println("NO");
            return;
        }
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            isPrime(n);
        }
        sc.close();
    }
}

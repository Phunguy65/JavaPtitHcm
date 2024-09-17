package org.ptithcmcode;

import java.util.Scanner;

/**
 * J01018:
 * Cho số nguyên dương N. Hãy kiểm tra xem N có thỏa mãn đồng thời hai tính chất sau đây hay không?
 *     Tổng chữ số của N chia hết cho 10
 *     Các chữ số cạnh nhau đều khác nhau đúng 2 đơn vị
 */
public class J01018 {
    static void checkNumber(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
            if (i > 0 && Math.abs(n.charAt(i) - n.charAt(i - 1)) != 2) {
                System.out.println("NO");
                return;
            }
        }
        if (sum % 10 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            checkNumber(n);
        }
        sc.close();
    }
}

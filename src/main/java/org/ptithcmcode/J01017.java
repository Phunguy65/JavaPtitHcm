package org.ptithcmcode;

/**
    * J01017:
    * Viết chương trình kiểm tra số nguyên dương N có thỏa mãn tính chất: tất cả các chữ số cạnh nhau chỉ sai khác nhau đúng một đơn vị hay không.
    * Ví dụ: số 123212 là số thỏa mãn, số 34578 không thỏa mãn.
 */
public class J01017 {
    static void checkNumber(String n) {
        for (int i = 0; i < n.length() - 1; i++) {
            if (Math.abs(n.charAt(i) - n.charAt(i + 1)) != 1) {
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
            String n = sc.next();
            checkNumber(n);
        }
        sc.close();
    }
}

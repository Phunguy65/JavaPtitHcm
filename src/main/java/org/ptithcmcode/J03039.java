package org.ptithcmcode;

/**
 * J03039:
 * @author PNguyen 
 * Cho hai số nguyên dương a và b không quá 500 chữ số. Hãy kiểm tra xem a chia hết cho b hoặc b chia hết cho a hay không. 
 */
public class J03039 {
        
        public static boolean isDivisible(String a, String b) {
            java.math.BigInteger bigA = new java.math.BigInteger(a);
            java.math.BigInteger bigB = new java.math.BigInteger(b);
            
            return bigA.mod(bigB).equals(java.math.BigInteger.ZERO) || bigB.mod(bigA).equals(java.math.BigInteger.ZERO);
        }
        
        public static void main(String[] args) {
            try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
                int t = sc.nextInt();
                
                while (t-- > 0) {
                    System.out.println(isDivisible(sc.next(), sc.next()) ? "YES" : "NO");
                }
                
            }
        }
}

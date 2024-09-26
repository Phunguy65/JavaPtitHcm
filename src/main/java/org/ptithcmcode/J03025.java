package org.ptithcmcode;

/**
 * J03025:
 * @author PNguyen
 * 
 * Cho trước một xâu S. Bạn thay đổi đúng 1 kí tự. Hãy kiểm tra xem liệu bạn có thể tạo ra được xâu đối xứng hay không.
 */
public class J03025 {
    
    private static boolean isPalindrome(String s) {
        int len = s.length();
        for(int i = 0; i < len / 2; i++) {
            if(s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean canMakePalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        int diffCount = 0;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                diffCount++;
                if (diffCount > 1) {
                    return false;
                }
            }
            left++;
            right--;
        }
        
        return diffCount == 1 || (s.length() % 2 == 1 && diffCount == 0);
    }
    
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine().trim();
            System.out.println(canMakePalindrome(s) ? "YES" : "NO");
        }
        
        sc.close();
    }
}

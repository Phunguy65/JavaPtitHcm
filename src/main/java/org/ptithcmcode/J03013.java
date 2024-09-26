package org.ptithcmcode;


/**
 * J03013:
 * Cho hai số rất lớn X và Y được biểu diễn như hai xâu ký tự. Nhiệm vụ của bạn là tìm |X-Y|?
    * <p>
 * Dòng đầu tiên đưa vào số lượng test T.
 * Những dòng kế tiếp đưa vào các bộ test. Mỗi test gồm hai dòng: dòng thứ nhất đưa xâu X; 
 * dòng tiếp theo đưa vào xâu Y.
 * T, X, Y thỏa mãn ràng buộc : 1≤T≤100; 0≤length(X), length(Y)≤103.
 * Input:
 * 1
 * 100
 * 1000000
 * Output:
 * 0999900
 */
public class J03013 {
    
    private static String getAbs(String x, String y) {
        
        String first = x;
        String second = y;
        if(x.length() < y.length()) {
            first = y;
            second = x;
        }
        
        int len1 = first.length();
        int len2 = second.length();
        
        StringBuilder res = new StringBuilder();
        
        int carry = 0;
        
        for(int i = 0; i < len1; i++) {
            int a = first.charAt(len1 - i - 1) - '0';
            int b = 0;
            if(i < len2) {
                b = second.charAt(len2 - i - 1) - '0';
            }
            
            int sum = a - b - carry;
            if(sum < 0) {
                sum += 10;
                carry = 1;
            } else {
                carry = 0;
            }
            
            res.append(sum);
        }
        
        res.reverse();
        
        while(res.length() > 1 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        
        return res.toString();
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0) {

            String x = sc.nextLine();
            String y = sc.nextLine();
            
            System.out.println(getAbs(x, y));
        }
        
        sc.close();
    }
}

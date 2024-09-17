package org.ptithcmcode;

/**
 * J01010:
 * Với một vài số nguyên dương có 1 chữ số, khi cắt đôi số đó theo chiều ngang và lấy nửa phía trên thì ta vẫn có một số nguyên. Cụ thể:
 * <p>
 *     Số 0 cắt đôi vẫn ra số 0
 *     Số 1 cắt đôi vẫn ra số 1
 *     Số 8 cắt đôi ra số 0
 *     Số 9 cắt đôi ra số 0
 *     Các số khác cắt đôi sẽ không hợp lệ.
 * <p>
 * Cho một số nguyên dương không quá 18 chữ số. Hãy in ra kết quả “cắt đôi” của số đó.
 *
 * Nếu không hợp lệ thì ghi ra INVALID. 
 * Chú ý: nếu cắt đôi ra một dãy toàn 0 thì cũng được coi là không hợp lệ. Kết quả cắt đôi thì không tính chữ số 0 ở đầu.
 */

public class J01010 {
    static void cutNumber(String n) {
        StringBuilder sb = new StringBuilder();
        int  count = n.length(); 
        for(int i = 0; i < n.length(); i++) {
            if (!isCutNumber(n.charAt(i))) {
                System.out.println("INVALID");
                return; 
            }else {

                    sb.append(cut(n.charAt(i)));
                
                
            }
        }
        
        if(sb.chars().allMatch(c -> c == '0')){
            System.out.println("INVALID");
            return;
        }
        
        System.out.println(sb.toString().replaceFirst("^0+(?!$)", ""));

    }
    
    static boolean isCutNumber(char c) {
        return c == '0' || c == '1' || c == '8' || c == '9';
    }
    
    static char cut(char c) {
        if(c == '1')
            return '1';
        return '0';
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int  n = sc.nextInt();
        
        while (n-- > 0) {
            String number = sc.next();
            cutNumber(number);
        }
        
        sc.close();
    }
}

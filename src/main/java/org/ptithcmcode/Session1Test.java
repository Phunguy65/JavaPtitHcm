package org.ptithcmcode;

import java.util.ArrayList;

/**
 * Session1Test:
 * Viết chương trình xuất danh sách các chữ số của số nguyên n và vị trí của nó sao cho chữ số này là tổng của 2 hoặc 3 chữ số (không tính chữ số 0) của số nguyên n. 
 * Nếu không có chữ số nào thoả mãn thì in ra số 0, vị trí -1
 * <p> 
 * Ví dụ 1:
 * - Input:
 *     324102
 * - Output: 
 *     3, 0
 *     4, 2
 * <p>
 * Ví dụ 2:
 * - Input:
 *     44102
 * - Output: 
 *     0, -1 
 * <p>
 * Ví dụ 3:
 * - Input:
 *     213536
 * - Output: 
 *     3, 2
 *     5, 3
 *     3, 4
 *     6, 5
 */
public class Session1Test {
    

    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
//            useNormalMethods(n);
        }
        sc.close();
    }
}

class UseNormalMethod{
    private final int n;
    private final ArrayList<Integer> list = new ArrayList<>();
    
    public UseNormalMethod(int n){
        this.n = n;
        
        while(n > 0){
            list.add(n % 10);
            n /= 10;
        }
    }
    
    private  int sumOfTwoDigits() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) continue;

            var sum = list.get(i);


        }
        return 0;
    }
}

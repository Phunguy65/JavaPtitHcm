package org.ptithcmcode;

import java.util.ArrayList;

/**
 * J02017:
 *Cho dãy số A[] chỉ bao gồm các số nguyên dương. 
 * <p> 
 * Người ta thu gọn dần dãy số bằng cách loại bỏ các cặp phần tử kề nhau mà có tổng là chẵn. 
 * Sau khi cặp phần tử đó bị loại ra thì dãy số được dồn lại. 
 * Cứ tiếp tục như vậy cho đến khi không còn cặp phần tử nào kề nhau có tổng chẵn nữa.
 * <p>
 * Hãy tính xem cuối cùng dãy A[] còn bao nhiêu phần tử. 
 */
public class J02017 {
    
    private static int countElement(ArrayList<Integer> list) {
        
        while(true) {
            boolean flag = false;
            for(int i = 0; i < list.size() - 1; i++) {
                if((list.get(i) + list.get(i + 1)) % 2 == 0) {
                    list.remove(i);
                    list.remove(i);
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                break;
            }
        }
        
        return list.size();
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

            int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        System.out.println(countElement(list));
        
        sc.close();
    }
}

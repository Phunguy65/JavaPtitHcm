package org.ptithcmcode;

import java.util.ArrayList;

/**
 * J02025:
 * @author PNguyen
 * 
 * Dãy số A[] gồm N phần tử là các số nguyên và đã được sắp xếp tăng dần. Các phần tử của dãy A[] có thể giống nhau. Sau đó ta thực hiện quay vòng phải, mỗi lần lấy một số ở cuối dãy đưa lên đầu dãy.
 *
 * Cho trạng thái dãy số của A[] sau khi đã thực hiện quay vòng K lần. Hãy tìm K.
 * 
 * Input:
 *
 *     Dòng đầu tiên đưa vào số lượng bộ test T.
 *     Những dòng kế tiếp đưa vào các bộ test. Mỗi bộ test gồm 2 dòng: dòng thứ nhất đưa vào số N; dòng tiếp theo đưa vào N số của mảng A[]các số được viết cách nhau một vài khoảng trống.
 *     T, N, A[i] thỏa mãn ràng buộc: 1≤T≤100;  1≤ N≤10^7; 0≤ A[i]≤10^18.
 */
public class J02035 {
    
    
    private static long getK(ArrayList<Long> arr){
        if(arr.stream().distinct().count() == 1) return 0;
        
        long maxValue = Long.MIN_VALUE;
        long maxIndex = 0;
        
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > maxValue) {
                maxValue = arr.get(i);
                maxIndex = i;
            }
        }
        
        if(maxIndex == arr.size() - 1) {
            return 0;
        }
        
        return maxIndex + 1;
    }
    
    public static void main (String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int t = sc.nextInt();
            sc.nextLine();
            while(t-- > 0) {
                int n = sc.nextInt();
                ArrayList<Long> arr = new ArrayList<>();
                for(int i = 0; i < n; i++) {
                    arr.add(sc.nextLong());
                }
                System.out.println(getK(arr));
            }
        }
    }
}

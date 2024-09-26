package org.ptithcmcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * J03105:
 * @author PNguyen
 * 
 * Cho hai số rất lớn X và Y được biểu diễn như hai xâu ký tự. Nhiệm vụ của bạn là tìm X+Y?
 */
public class J03102 {

    public static String addLargeNumbers(String X, String Y) {
        if(X.isEmpty() || Y.isEmpty()) {
            return X.isEmpty() ? Y : X;
        }
        
        BigInteger a = new BigInteger(X);
        
        BigInteger b = new BigInteger(Y);
        
        return a.add(b).toString();
        
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            sc.nextLine();
            while(t-- > 0) {
                String X = sc.nextLine();
                String Y = sc.nextLine();
                
                X = X.trim().isEmpty() ? "" : X;
                Y = Y.trim().isEmpty() ? "" : Y;
                
                System.out.println(addLargeNumbers(X, Y));
            }
        }
    }
}

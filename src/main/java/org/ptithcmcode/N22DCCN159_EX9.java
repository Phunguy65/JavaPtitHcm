package org.ptithcmcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class N22DCCN159_EX9 {
    public static void main(String[] args) {
        try (var sc = new Scanner(new File(N22DCCN159_EX9.class.getResource("/square.in").getFile()))) {
            while (sc.hasNext()) {
                var number = sc.nextInt();
                
                if(number < 0 ) {
                    throw new IllegalArgumentException("Invalid number");
                }
                
                System.out.println((int) Math.sqrt(number));
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}


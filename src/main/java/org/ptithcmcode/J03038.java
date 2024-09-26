package org.ptithcmcode;

import java.util.Map;

/**
 * J03038:
 * @author PNguyen 
 * Cho một xâu ký tự S chỉ có các chữ cái Tiếng Anh viết thường. Hãy đếm xem có bao nhiêu ký tự chữ cái khác nhau trong S.
 */
public class J03038 {
    
    public static int countDifferentCharacters(String s) {

        Map<Character, Integer> map = new java.util.HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        return map.size();
    }
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println(countDifferentCharacters(sc.nextLine()));
        sc.close();
    }
}

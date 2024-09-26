package org.ptithcmcode;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * J07006:
 * @author PNguyen
 * Cho file nhị phân DATA.in có một ArrayList<Integer>, giá trị các số đều lớn hơn hoặc bằng 0 và nhỏ hơn 1000. Có không quá 106 số trong danh sách. 
 *
 * Hãy liệt kê các số khác nhau xuất hiện trong file và số lần xuất hiện của từng số đó.
 */
public class J07006 {

    public static void main(String[] args) {
        String fileName = "DATA.in";
        int[] frequency = new int[1000]; // Đếm tần suất cho số từ 0 đến 999

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();

            for (int num : list) {
                if (num >= 0 && num < 1000) {
                    frequency[num]++;
                }
            }

            // In kết quả
            for (int i = 0; i < 1000; i++) {
                if (frequency[i] > 0) {
                    System.out.println(i + " " + frequency[i]);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

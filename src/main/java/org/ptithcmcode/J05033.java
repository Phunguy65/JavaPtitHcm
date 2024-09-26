package org.ptithcmcode;

import java.util.ArrayList;

/**
 * J05033:
 * @author PNguyen 
 *
 *Giá trị độ đo thời gian được biểu diễn bởi ba thành phần: giờ, phút, giây.
 *
 * Cho N giá trị thời gian, hãy sắp xếp danh sách theo thứ tự tăng dần.
 *
 * Input
 *
 * Dòng đầu ghi số nguyên dương N (không quá 5000) là số lượng giá trị thời gian cần sắp xếp.
 *
 * Mỗi giá trị thời gian biểu diễn trên một dòng bằng ba số nguyên dương, lần lượt là số giờ, số phút, số giây. Trong đó số giờ đảm bảo nhỏ hơn 100, số phút và số giây đảm bảo đúng quy tắc (tức là không quá 59).
 */
//public class J05033 {
//    
//    public static void main(String[] args) {
//        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
//            int n = sc.nextInt();
//            ArrayList<Time> times = new ArrayList<>();
//            
//            for(int i = 0; i < n; i++) {
//                times.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
//            }
//            
//            times.sort(null);
//            
//            for(Time time : times) {
//                System.out.println(time);
//            }
//            
//        }
//    }
//}
//
//class Time implements Comparable<Time> {
//    private int hour;
//    private int minute;
//    private int second;
//
//    public Time(int hour, int minute, int second) {
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//    }
//
//    @Override
//    public int compareTo(Time o) {
//        if (hour != o.hour) {
//            return hour - o.hour;
//        }
//        if (minute != o.minute) {
//            return minute - o.minute;
//        }
//        return second - o.second;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%02d %02d %02d", hour, minute, second);
//    }
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class J05033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Time[] times = new Time[n];

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().trim().split("\\s+");
            times[i] = new Time(
                    Integer.parseInt(parts[0]),
                    Integer.parseInt(parts[1]),
                    Integer.parseInt(parts[2])
            );
        }

        Arrays.sort(times);

        for (Time time : times) {
            System.out.println(time);
        }
    }
}

class Time implements Comparable<Time> {
    private final int totalSeconds;

    public Time(int hour, int minute, int second) {
        this.totalSeconds = hour * 3600 + minute * 60 + second;
    }

    @Override
    public int compareTo(Time o) {
        return Integer.compare(totalSeconds, o.totalSeconds);
    }

    @Override
    public String toString() {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d %02d %02d", hours, minutes, seconds);
    }
}
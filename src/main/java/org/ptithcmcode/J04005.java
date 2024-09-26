package org.ptithcmcode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * J04005:
 * iết chương trình khai báo lớp Thí Sinh gồm các thông tin: Họ tên, Ngày sinh, Điểm môn 1, Điểm môn 2, Điểm môn 3 và Tổng điểm.
 * <p> 
 * Đọc thông tin 1 thí sinh từ bàn phím và in ra màn hình 3 thông tin: Họ tên, Ngày sinh, Tổng điểm.
 * <p>
 * Input
 * <p>
 * Gồm 5 dòng lần lượt, mỗi dòng ghi 1 thông tin: Họ tên, Ngày sinh, Điểm môn 1, Điểm môn 2, Điểm môn 3. Họ tên không quá 50 chữ cái, Ngày sinh viết đúng chuẩn dd/mm/yyyy. Các giá trị điểm là số thực (float). 
 */
public class J04005 {
    
    public static void main(String[] args) throws Exception {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            String name = sc.nextLine();
            
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date dob = df.parse(sc.nextLine());
            
            float score1 = sc.nextFloat();
            float score2 = sc.nextFloat();
            float score3 = sc.nextFloat();
            Student student = new Student(name, dob, score1, score2, score3);
            System.out.println(student);
        }
    }
}

class Student{
    private String name;
    private Date dob;
    private float score1, score2, score3, total;

    public Student(String name,Date dob, float score1, float score2, float score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.dob = dob;
        this.total = score1 + score2 + score3;
    }

    public String getName() {
        return name;
    }

    public float getTotal() {
        return total;
    }
    
    @Override
    public String toString() {
        return name + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + total;
    }
}



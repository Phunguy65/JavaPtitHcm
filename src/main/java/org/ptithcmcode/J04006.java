package org.ptithcmcode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * J04006:
 * @author PNguyen
 * Viết chương trình khai báo lớp Sinh Viên gồm các thông tin: Mã SV, Họ tên, Lớp, Ngày sinh và Điểm GPA (dạng số thực float). Hàm khởi tạo không có tham số, gán các giá trị thuộc tính ở trạng thái mặc định (xâu ký tự rỗng, giá trị số bằng 0).
 *
 * Đọc thông tin 1 sinh viên từ bàn phím (không có mã sinh viên) và in ra màn hình. Trong đó Mã SV được gán là B20DCCN001. Ngày sinh được chuẩn hóa về dạng dd/mm/yyyy.
 *
 * Input
 *
 * Gồm 4 dòng lần lượt là Họ tên, Lớp, Ngày sinh và Điểm GPA.
 *
 * Trong đó:
 *
 *     Họ tên không quá 30 chữ cái.
 *     Lớp theo đúng định dạng thường dùng ở PTIT
 *     Ngày sinh có đủ 3 phần ngày tháng năm nhưng có thể chưa đúng chuẩn dd/mm/yyyy.
 *     Điểm GPA đảm bảo trong thang điểm 4 với 2 nhiều nhất 2 số sau dấu phẩy. 
 */
public class J04006 {
    
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            StudentV2 student = new StudentV2();
            student.setName(sc.nextLine());
            student.setClassId(sc.nextLine());
            student.setDob(sc.nextLine());
            student.setGpa(sc.nextFloat());
            System.out.println(student);
        }
    }
}

class StudentV2{
    private static String id = "B20DCCN001";

    public void setName(String name) {
        this.name = name;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setDob(String dob) {
        
        // dd/MM/yyyy
        
        String[] parts = dob.split("/");
        
        String day = parts[0].length() == 1 ? "0" + parts[0] : parts[0];
        
        String month = parts[1].length() == 1 ? "0" + parts[1] : parts[1];
        
        String fullDob = day + "/" + month + "/" + parts[2];
        
        try {
            this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(fullDob);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    private String name, classId;
    
    private Date dob;
    
    private float gpa;
    
    public StudentV2() {
        this.name = "";
        this.classId = "";
        this.dob = new Date();
        this.gpa = 0;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + classId + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + String.format("%.2f", gpa);
    }
    
    
}
package org.ptithcmcode;

/**
 * J4013:
 * @author PNguyen
 * 
 * Trường Đại học XYZ tuyển sinh theo hình thức xét điểm thi ba môn Toán – Lý – Hóa, trong đó điểm Toán được nhân đôi. Để đơn giản, khu vực tuyển sinh được quy định luôn bởi ba chữ cái đầu tiên trong mã thí sinh. Do rất thích các thí sinh đến từ Khu vực 3 nên trường XYZ tự quy định giá trị điểm ưu tiên Khu vực như trong bảng sau:
 * 
 * KV1: 0.5
 * KV2: 1
 * KV3: 2.5
 * 
 * Giả sử biết trước điểm chuẩn là 24. Hãy xác định tình trạng của thí sinh.
 * 
 * Input
 *
 * Chỉ bao gồm thông tin của một thí sinh trên 5 dòng lần lượt là:
 *
 *     Mã thí sinh
 *     Họ tên
 *     Điểm toán
 *     Điểm lý
 *     Điểm hóa
 */
public class J04013 {
    
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            StudentV3 student = new StudentV3(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.println(student);
        }
    }
    
    
}

class StudentV3{
    private String id;
    
    private String name;
    
    private double math;
    
    private double physics;
    
    private double chemistry;
    
    private double priority;
    
    private double total;
    
    private String area;
    
    private String status;
    
    public StudentV3(String id, String name, double math, double physics, double chemistry){
        this.id = id;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        
        this.total = math * 2 + physics + chemistry;
        
        this.area = id.substring(0, 3);
        
        this.priority = area.equals("KV1") ? 0.5 : area.equals("KV2") ? 1 : 2.5;
        
        this.total += priority;
        
        this.status = total >= 24 ? "TRUNG TUYEN" : "TRUOT";
    }
    
    private String getNumberFormat(double number) {
        
        if(number == (long) number) {
            return String.format("%d", (long) number);
        } else {
            return String.format("%.1f", number);
        }
    }
    @Override
    public String toString() {
        return id + " " + name + " " + getNumberFormat(priority) + " " + getNumberFormat(total-priority) + " " + status;
    }
}

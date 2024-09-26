package org.ptithcmcode;

/**
 * J04012:
 * @author PNguyen 
 * 
 * Thông tin về nhân viên bao gồm:
 *
 *     Mã nhân viên (tự động tăng theo thứ tự nhập, tính từ NV01, nếu chỉ có 1 nhân viên thì mã là NV01)
 *     Họ và tên
 *     Lương cơ bản mỗi ngày công
 *     Số ngày công
 *     Chức vụ
 *
 * Tiền lương được tính bằng lương cơ bản nhân với số ngày công.
 *
 * Giả sử quy tắc tính tiền thưởng như sau:
 *
 *     Số ngày công từ 25 trở lên thì thưởng 20% tiền lương
 *     Số ngày công từ 22 đến dưới 25 thì thưởng 10% tiền lương
 *     Dưới 22 ngày công thì không có thưởng.
 *
 * Mỗi nhân viên có thể có thêm phụ cấp chức vụ:
 *
 *     GD: 250000  
 *     PGD: 200000 
 *     TP: 180000
 *     NV: 150000
 *
 * Hãy nhập thông tin 1 nhân viên và tính toán thu nhập theo quy tắc trên. 
 */
public class J04012 {
    
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            EmployeeV2 employee = new EmployeeV2(sc.nextLine(), sc.nextLong(), sc.nextInt(), sc.next());
            System.out.println(employee);
        }
    }
    
    
}

class EmployeeV2{
    private static int count = 0;
    
    private String id;
    
    private String name;
    
    private long baseSalary;
    
    private int workDays;
    
    private String position;
    
    private long bonus;

    {
        count++;
        if(count < 10) {
            id = "NV0" + count;
        } else {
            id = "NV" + count;
        }
    }
    
    public EmployeeV2(String name, long baseSalary, int workDays, String position){
        this.name = name;
        this.baseSalary = baseSalary;
        this.workDays = workDays;
        this.position = position;
    }
    
    private int getBonusForPosition(){
        switch (position) {
            case "GD":
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            case "NV":
                return 150000;
            default:
                return 0;
        }
    }
    
    private long getSalaryWithoutBonus(){
        return baseSalary * workDays;
    }
    
    private long getBonus(){
        if(workDays >= 25) {
            return (long) (getSalaryWithoutBonus() * 0.2);
        } else if(workDays >= 22) {
            return (long) (getSalaryWithoutBonus() * 0.1);
        } else {
            return 0;
        }
    }
    
    
    private long getSalary(){
        return getSalaryWithoutBonus() + getBonus() + getBonusForPosition();
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + getSalaryWithoutBonus() + " " + getBonus() + " " + getBonusForPosition() + " " + getSalary();
    }
}

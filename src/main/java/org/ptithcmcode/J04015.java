package org.ptithcmcode;

/**
 * J04015:
 * @author PNguyen 
 * Trường phổ thông XYZ tính lương giáo viên theo quy tắc sau:
 *
 *     Mỗi giáo viên có mã ngạch gồm 4 ký tự trong đó
 *         2 ký tự đầu là chức vụ (HT: Giáo viên kiêm nhiệm Hiệu trưởng, HP: Giáo viên kiêm nhiệm Hiệu phó, GV: Giáo viên thường)
 *         2 ký tự số cuối cùng cho biết hệ số bậc lương (không quá 20)
 *     Lương cơ bản của mỗi giáo viên cũng có thể khác nhau
 *     Phụ cấp quy định như sau
 *         HT: 2.000.000
 *         HP: 900.000
 *         GV: 500.000
 *     Thu nhập được tính bằng lương cơ bản nhân với hệ số bậc lương và cộng thêm phụ cấp.
 *
 * Hãy tính lương cho 1 giáo viên theo quy tắc trên. 
 */
public class J04015 {
    
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            Teacher teacher = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextLong());
            System.out.println(teacher);
        }
    }
}

class Teacher{
    
    private String code;
    
    private long baseSalary;
    
    private String name;
    
    public Teacher(String code, String name, long baseSalary){
        this.code = code;
        this.name = name;
        this.baseSalary = baseSalary;
        
        this.level = Byte.parseByte(code.substring(2));
        this.bonus = code.startsWith("HT") ? 2000000 : code.startsWith("HP") ? 900000 : 500000;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    private byte level;
    
    private int bonus;
    
    public long getSalary(){
        return baseSalary * level + bonus;
    }
    
    @Override
    public String toString(){
        return code + " " + name + " " + level + " " + bonus + " " + getSalary();
    }
}
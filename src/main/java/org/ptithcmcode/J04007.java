package org.ptithcmcode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * J04007:
 * @author PNguyen
 * Một nhân viên làm việc trong công ty được lưu lại các thông tin sau:
 *
 *     Mã nhân viên: được gán giá trị là 00001
 *     Họ tên: Xâu ký tự không quá 40 chữ cái.
 *     Giới tính: Nam hoặc Nu
 *     Ngày sinh: đúng theo chuẩn dd/mm/yyyy
 *     Địa chỉ: Xâu ký tự không quá 100 chữ cái
 *     Mã số thuế: Dãy số có đúng 10 chữ số
 *     Ngày ký hợp đồng: đúng theo chuẩn dd/mm/yyyy
 *
 * Viết chương trình nhập một nhân viên (không nhập mã) in ra màn hình thông tin của nhân viên đó.
 *
 * Input
 *
 * Gồm 6 dòng lần lượt ghi các thông tin theo thứ tự đã ghi trong đề bài. Không có mã nhân viên.
 */
public class J04007 {
    
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            Employee employee = new Employee(sc.nextLine(), sc.nextLine(), new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine()), sc.nextLine(), sc.nextLine(), new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine()));
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Employee {
    private final String id = "00001";

    private String name;

    private String sex;
    
    private Date dob;
    
    private String address;
    
    private String taxCode;
    
    private Date contractDate;
    
    public Employee(String name, String sex, Date dob, String address, String taxCode, Date contractDate) {
        this.name = name;
        this.dob = dob;
        this.sex = sex;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + address + " " + taxCode + " " + new SimpleDateFormat("dd/MM/yyyy").format(contractDate);
    }
}
    

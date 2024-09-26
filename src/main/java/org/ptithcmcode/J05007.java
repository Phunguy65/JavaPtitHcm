package org.ptithcmcode;


import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * J05006:
 * @author PNguyen
 * Một nhân viên làm việc trong công ty được lưu lại các thông tin sau:
 *
 *     Mã nhân viên: được gán tự động tăng, bắt đầu từ 00001
 *     Họ tên: Xâu ký tự không quá 40 chữ cái.
 *     Giới tính: Nam hoặc Nu
 *     Ngày sinh: đúng theo chuẩn dd/mm/yyyy
 *     Địa chỉ: Xâu ký tự không quá 100 chữ cái
 *     Mã số thuế: Dãy số có đúng 10 chữ số
 *     Ngày ký hợp đồng: đúng theo chuẩn dd/mm/yyyy
 *
 * Viết chương trình nhập danh sách nhân viên (không nhập mã) trong đó có sử dụng chồng toán tử nhập/xuất và in ra màn hình danh sách vừa nhập. 
 */
public class J05007 {

    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int t = Integer.parseInt(sc.nextLine());

            java.util.List<EmployeeV6> employees = new java.util.ArrayList<>();
            
            while(t-- > 0) {
                EmployeeV6 employee = new EmployeeV6(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
                employees.add(employee);
            }
            
            employees.stream().sorted().forEach(System.out::println);
        }
    }
}

class EmployeeV6 implements Comparable<EmployeeV6> {
    private static int count = 0;

    private String id;

    private String name;

    private String sex;

    private String dob;

    private String address;

    private String taxCode;

    private String contractDate;

    {
        count++;

        if(count < 10) {
            id = "0000" + count;
        } else if(count < 100) {
            id = "000" + count;
        }
    }

    public EmployeeV6(String name, String sex, String dob, String address, String taxCode, String contractDate) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
    }
    
    public Date getDob() {
        try{
            return new java.text.SimpleDateFormat("dd/MM/yyyy").parse(dob);
        } catch(Exception e) {
            return null;
        }
    }
    
    @Override
    public int compareTo(EmployeeV6 o) {
        return getDob().compareTo(o.getDob());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + dob + " " + address + " " + taxCode + " " + contractDate;
    }
}

package org.ptithcmcode;

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
public class J05006 {
}

class EmployeeV3{
    private static int count = 0;
    
    private String id;
    
    private String name;
    
    private String sex;
    
    private Date dob;
    
    private String address;
    
    private String taxCode;
    
    private Date contractDate;

    {
        count++;
        
        if(count < 10) {
            id = "0000" + count;
        } else if(count < 100) {
            id = "000" + count;
        }
    }
    
    public EmployeeV3(String name, String sex, Date dob, String address, String taxCode, Date contractDate) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " "; 
    }
}

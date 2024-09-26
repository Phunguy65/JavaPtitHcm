package org.ptithcmcode;

/**
 * J05010:
 * 
 * @author PNguyen 
 * 
 * Hãy sắp xếp danh sách các mặt hàng theo lợi nhuận giảm dần. Mỗi mặt hàng gồm các thông tin: Mã mặt hàng (là một số nguyên, tự động tăng, tính từ 1); Tên mặt hàng, nhóm hàng: là các xâu ký tự; Giá mua, giá bán: là các số thực (không quá 9 chữ số)
 *
 * Dữ liệu vào
 *
 * Dòng đầu chứa số mặt hàng. Mỗi mặt hàng viết trên 4 dòng: Dòng 1: Tên mặt hàng. Dòng 2: Nhóm hàng. Dòng 3: Giá mua. Dòng 4: Giá bán
 *
 * Kết quả: Ghi ra danh sách mặt hàng đã sắp xếp theo lợi nhuận giảm dần (lợi nhuận tính bằng giá bán trừ đi giá mua). Mỗi mặt hàng viết trên một dòng gồm: mã, tên, nhóm hàng và lợi nhuận (với 2 chữ số sau dấu phẩy). Các thông tin cách nhau đúng 1 khoảng trống.
 */
public class J05010 {
    
    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int t = Integer.parseInt(sc.nextLine());
            
            java.util.List<Item> items = new java.util.ArrayList<>();
            
            while(t-- > 0) {
                Item item = new Item(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
                items.add(item);
            }
            
            items.stream().sorted().forEach(System.out::println);
        }
    }
}

class Item  implements Comparable<Item> {
    @Override
    public int compareTo(Item o) {
        return Double.compare(o.getProfit(), getProfit());
    }

    private static int count = 0;

    private int id;

    private String name;

    private String group;

    private double buyPrice;

    private double sellPrice;

    {
        count++;
    }

    public Item(String name, String group, double buyPrice, double sellPrice) {
        this.id = count;
        this.name = name;
        this.group = group;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getProfit() {
        return sellPrice - buyPrice;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.2f", id, name, group, getProfit());
    }
}


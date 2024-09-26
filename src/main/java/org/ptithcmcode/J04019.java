package org.ptithcmcode;

/**
 * J04019:
 * 
 * @author PNguyen
 * 
 * Khai báo lớp Point (điểm trong không gian hai chiều) với hai thuộc tính là tọa độ x và tọa độ y (số thực).
 *
 * Khai báo lớp Triangle (tam giác) với thuộc tính là 3 điểm. Viết các phương thức phù hợp để tính chu vi tam giác
 */
public class J04019 {
    
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            
            int t = sc.nextInt();
            
            while(t-- > 0) {
                PointV3 a = new PointV3(sc.nextDouble(), sc.nextDouble());
                PointV3 b = new PointV3(sc.nextDouble(), sc.nextDouble());
                PointV3 c = new PointV3(sc.nextDouble(), sc.nextDouble());
                
                TriangleV3 triangle = new TriangleV3(a, b, c);
                System.out.println(triangle.perimeter());
            }
        }
    }
}

class PointV3 {
    private double x;
    private double y;

    public PointV3(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(PointV3 p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
}

class TriangleV3 {
    private PointV3 a;
    private PointV3 b;
    private PointV3 c;

    public TriangleV3(PointV3 a, PointV3 b, PointV3 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String perimeter() {
       
        if(a.distance(b) + b.distance(c) > a.distance(c) && a.distance(b) + a.distance(c) > b.distance(c) && b.distance(c) + a.distance(c) > a.distance(b)) {
            return String.format("%.3f", a.distance(b) + b.distance(c) + a.distance(c));
        }else {
            return "INVALID";
        }
        
    }
}


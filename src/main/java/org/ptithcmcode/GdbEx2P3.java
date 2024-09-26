package org.ptithcmcode;

/**
 * GdbEx2P3:
 * @author PNguyen
 * <p>
 *  A point has an x-coordinate, a y-coordinate and some methods as below:
 * <p>  
 * + Point()
 * <p> 
 * + Point(x: double, y: double)
 * <p> 
 * + toString(): String
 * <p> 
 * + distance(p: Point) // compute the Euclidean distance between two points.
 * 
 * Write a program to test Point class.
 */
public class GdbEx2P3 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        System.out.println(p1.distance(p2));
    }
}

class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
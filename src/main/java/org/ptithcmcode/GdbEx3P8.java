package org.ptithcmcode;

public class GdbEx3P8 {
    
    public static void main(String[] args) {
        CircleV3 c = new CircleV3(1.0);
        System.out.println(c);
        
        ResizableCircle rc = new ResizableCircle(1.0);
        System.out.println(rc);
        rc.resize(50);
        System.out.println(rc);
    }
}

interface GeometricObject {
    double getPerimeter();
    double getArea();
}

class CircleV3 implements GeometricObject {
    protected double radius;
    
    public CircleV3(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}

interface Resizable {
    void resize(int percent);
}
class ResizableCircle extends CircleV3 implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }
    
    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
    
    @Override
    public String toString() {
        return "Resizable " + super.toString();
    }
}



package org.ptithcmcode;

import java.util.ArrayList;

public class GdbEx2P5 {
    
    public static void main(String[] args) {
        Circle c = new Circle(1.0, "red", false);
        System.out.println(c);
        
        Rectangle r = new Rectangle(2.0, 3.0, "blue", true);
        System.out.println(r);
        
        Square s = new Square(4.0, "yellow", false);
        System.out.println(s);

        ArrayList<Shape> shapes = new ArrayList<>();
        
        shapes.add(c);
        shapes.add(r);
        shapes.add(s);
        
        for(Shape shape : shapes) {
            System.out.println(shape);
        }
        
        Circle temp = shapes.getFirst() instanceof Circle ? (Circle) shapes.getFirst() : null;
        
        if(temp != null) {
            System.out.println(temp.getArea());
            System.out.println(temp.getPerimeter());
        }
    }
}

class Shape{
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "not filled");
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }
}

class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString(){
        return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    }
}

class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "A Square with side = " + super.getWidth() + ", which is a subclass of " + super.toString();
    }
}

package org.ptithcmcode;

public class GdbEx3P7 {
    
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 1, 1);
        System.out.println(p);
        p.moveUp();
        System.out.println(p);
        p.moveRight();
        System.out.println(p);
        
        MovableCircle c = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println(c);
        c.moveDown();
        System.out.println(c);
        c.moveLeft();
        System.out.println(c);
    }
}

interface Moveable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Moveable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public void moveUp() {
        y -= ySpeed;
    }
    
    @Override
    public void moveDown() {
        y += ySpeed;
    }
    
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    
    @Override
    public void moveRight() {
        x += xSpeed;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
}

class MovableCircle implements Moveable {
    private int radius;
    private MovablePoint center;
    
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    
    @Override
    public void moveUp() {
        center.moveUp();
    }
    
    @Override
    public void moveDown() {
        center.moveDown();
    }
    
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    
    @Override
    public void moveRight() {
        center.moveRight();
    }
    
    @Override
    public String toString() {
        return "Center: " + center + " Radius: " + radius;
    }
}
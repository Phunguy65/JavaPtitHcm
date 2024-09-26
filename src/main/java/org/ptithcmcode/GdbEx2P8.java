package org.ptithcmcode;

public class GdbEx2P8 {
    public static void main(String[] args) {
        LineSub line = new LineSub(1, 2, 3, 4);
        System.out.println(line);
        System.out.println(line.getLength());
    }
}

class PointV2 {
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double x;
    private double y;


    public PointV2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
}

class LineSub extends PointV2 {
    private PointV2 end;
    private PointV2 begin;
    
    public LineSub(double x1, double y1, double x2, double y2) {
        super(x1, y1);
        this.end = new PointV2(x2, y2);
    }
    
    public LineSub(PointV2 begin, PointV2 end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    
    public PointV2 getBegin() {
        return begin;
    }
    
    public PointV2 getEnd() {
        return end;
    }
    
    
    public void setBegin(PointV2 begin) {
        this.begin = begin;
    }
    
    public void setEnd(PointV2 end) {
        this.end = end;
    }
    
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - getX(), 2) + Math.pow(end.getY() - getY(), 2));
    }
    
    @Override
    public String toString() {
        return "LineSub{" + "begin=" + getX() + ", " + getY() + ", end=" + end.getX() + ", " + end.getY() + '}';
    }
    
}

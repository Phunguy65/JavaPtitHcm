package org.ptithcmcode;

/**
 * GdbEx2p6:
 * @author PNguyen
 * 
 * a. Create a super class called Car. The Car class has the following fields and methods. 
 * <p>
 *     int speed; 
 * <p>
 *     double regularPrice; 
 * <p>
 *     String color; 
 * <p>
 *     double getSalePrice();
 * <p>
 * b. Create a subclass of Car class and name it as Truck. The Truck class has the following fields and methods.
 * <p>
 *     int weight;
 * <p>
 *     double getSalePrice(); //If weight>2000, 10% discount. Otherwise, 20% discount.
 * <p>
 * c. Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
 * <p>
 *     int year;
 * <p>
 *     int manufacturerDiscount;
 * <p>
 *     double getSalePrice(); //From the sale price computed from Car class, subtract the manufacturerDiscount.
 * <p>
 * d. Create MyOwnAutoShop class which contains the main() method. Perform the following within the main() method.
 * <p>
 *     Create an instance of Truck class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the superclass.
 *
 *     Create two instances of the Ford class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the superclass.
 */
public class GdbEx2P6 {
    public static void main(String[] args) {
        Truck truck = new Truck(100, 10000, "red", 3000);
        Ford ford1 = new Ford(120, 20000, "blue", 2010, 5000);
        Ford ford2 = new Ford(130, 30000, "green", 2015, 6000);

        System.out.println("Truck sale price: " + truck.getSalePrice());
        System.out.println("Ford 1 sale price: " + ford1.getSalePrice());
        System.out.println("Ford 2 sale price: " + ford2.getSalePrice());

    }
    
}

class Car {
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    
    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;
    
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        return weight > 2000 ? regularPrice * 0.9 : regularPrice * 0.8;
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;
    
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}


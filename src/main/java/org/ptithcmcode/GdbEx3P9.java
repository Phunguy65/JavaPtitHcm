package org.ptithcmcode;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author SV
 */
public class GdbEx3P9 {

    public static void main(String[] args) {
        LinkedList<EmployeeV5> linkedListFirst =  new LinkedList<>();
        
        for(int i = 0; i < 10; i++) {
            linkedListFirst.add(new EmployeeV5("Employee " + i, new Random().nextInt(1000) + 1000, 2021, 1, 1));
        }
        
        for (EmployeeV5 employeeV5 : linkedListFirst) {
            System.out.println(employeeV5);
        }
        
        LinkedList<EmployeeV5> linkedListSecond = linkedListFirst.reversed();
        
        for (EmployeeV5 employeeV5 : linkedListSecond) {
            System.out.println(employeeV5);
        }
    }
}

class EmployeeV5{

    private String name;
    private double salary;
    private LocalDate hireDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(){
        return;
    }

    public EmployeeV5(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }


    @Override
    public String toString(){
        return this.getName() + " " + this.getHireDay() + " " + this.getSalary();
    }

}

package org.ptithcmcode;


import java.time.LocalDate;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GdbEx3P12 {
    public static void main(String[] args) {
        Map<String, EmployeeV4> employees = new java.util.TreeMap<>();
        
        for(int i = 0; i < 10; i++) {
            employees.put("N22DCCN" + (new Random().nextInt(1000) + 1000), new EmployeeV4("Employee " + i, new Random().nextInt(1000) + 1000, 2021, 1, 1));
        }
        
        
        for(var keyIt: employees.keySet()) {
            System.out.println(keyIt);
        }
        
        for(var valueIt: employees.values()) {
            System.out.println(valueIt);
        }
        
        employees.remove(employees.entrySet().iterator().next().getKey());
        
        for(var keyIt: employees.keySet()) {
            System.out.println(keyIt);
        }
    }
}

class EmployeeV4 implements Comparable<EmployeeV4> {
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

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    private  String name;
    private  double salary;
    private LocalDate hireDate;

    public EmployeeV4(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    public void raiseSalary(double raise) {}

    @Override
    public String toString(){
        return "Name: " + name + " Salary: " + salary + " Hire Date: " + hireDate;
    }

    @Override
    public int compareTo(EmployeeV4 o) {
        return this.name.compareTo(o.name);
    }


}
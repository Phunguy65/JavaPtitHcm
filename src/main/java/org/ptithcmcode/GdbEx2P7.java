package org.ptithcmcode;

public class GdbEx2P7 {
    
    public static void main(String[] args) {
        MyDate date = new MyDate(2021, 2, 28);
        System.out.println(date);
        System.out.println(date.nextDay());
        System.out.println(date.nextMonth());
        System.out.println(date.nextYear());
        System.out.println(date.previousDay());
        System.out.println(date.previousMonth());
        System.out.println(date.previousYear());
        
        System.out.println(date.getDayOfWeek(2021, 2, 28));
        
        System.out.println(date.isLeapYear(2021));
        
        System.out.println(date.isValidDate(2021, 2, 28));
        
        
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;
    
    private static final String[] strMonths = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    
    private static final String[] strDays = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };
    
    private static final int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public MyDate nextDay(){
        day++;
        if(day > daysInMonth[month - 1]){
            day = 1;
            month++;
            if(month > 12){
                month = 1;
                year++;
            }
        }
        return this;
    }
    
    public MyDate nextMonth(){
        month++;
        if(month > 12){
            month = 1;
            year++;
        }
        return this;
    }
    
    public MyDate nextYear(){
        year++;
        return this;
    }
    
    public MyDate previousDay(){
        day--;
        if(day < 1){
            month--;
            if(month < 1){
                month = 12;
                year--;
            }
            day = daysInMonth[month - 1];
        }
        return this;
    }
    
    public MyDate previousMonth(){
        month--;
        if(month < 1){
            month = 12;
            year--;
        }
        return this;
    }
    
    public MyDate previousYear(){
        year--;
        return this;
    }
    
    public int getDayOfWeek(int year, int month, int day){
        int y = year;
        int m = month;
        if(m < 3){
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (day + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return h;
    }
    
    public boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public boolean isValidDate(int year, int month, int day){
        if(year < 1 || month < 1 || month > 12 || day < 1){
            return false;
        }
        if(isLeapYear(year) && month == 2){
            return day <= 29;
        }
        return day <= daysInMonth[month - 1];
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}

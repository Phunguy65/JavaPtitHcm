package org.ptithcmcode;

/**
 * J04003:
 * Viết chương trình khai báo lớp Phân số gồm hai thuộc tính private là tử số và mẫu số. Các giá trị đều nguyên dương và không quá 18 chữ số.
 *
 * Sau đó thực hiện nhập vào một phân số và in ra phân số đó ở dạng tối giản. 
 */
public class J04003 {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            Fraction fraction = new Fraction(sc.nextLong(), sc.nextLong());
            fraction.reduce();
            System.out.println(fraction);
        }
    }
}

class Fraction {
    private long numerator, denominator;

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public void reduce() {
        long gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

package HW5;

import java.util.Scanner;

public class Rational_test {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
        Rational r1 = new Rational(2, 4); // 1/2로 자동 약분됨
        Rational r2 = new Rational(1, 3);
        
        System.out.println("r1: " + r1.toString());
        System.out.println("r2: " + r2.toString());
        
        System.out.println("r1 + r2 = " + Rational.add(r1, r2));
        System.out.println("r1 - r2 = " + Rational.subtract(r1, r2));
        System.out.println("r1 * r2 = " + Rational.multiply(r1, r2));
        System.out.println("r1 / r2 = " + Rational.divide(r1, r2));
        
        System.out.println("소수점 : ");
        int num = input.nextInt();
        System.out.println("r1을 소수점으로 변환 : " + r1.Floating(num));
        
        input.close();
    }
}
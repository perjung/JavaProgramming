package HW5;

public class Rational {
	private int numerator; //분자
	private int denominator; //분모
	
	public Rational() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public Rational( int numerator, int denominator) {
		if( denominator == 0) {
			System.out.print("분모 0 금지");
			System.exit(0);
		}
		
		int num1 = gcd(Math.abs(numerator),Math.abs(denominator));
		this.numerator = numerator/num1;
		this.denominator = denominator / num1;
	}
	
	private int gcd(int a, int b) {
		return b==0?a: gcd(b,a%b);
	}
	
	public static Rational add(Rational r1, Rational r2) {
		int n = r1.numerator *r2.denominator + r2.numerator* r1.denominator;
		int d = r1.denominator * r2.denominator;
		
		return new Rational(n,d);
	}
	
	
	public static Rational subtract(Rational r1, Rational r2) {
		int n = r1.numerator*r2.denominator - r2.numerator*r1.denominator;
		int d = r1.denominator*r2.denominator;
		
		return new Rational(n,d);
	}
	
	public static Rational multiply(Rational r1, Rational r2) {
		return new Rational(r1.numerator*r2.numerator, r1.denominator*r2.denominator);
	}
	
	public static Rational divide(Rational r1, Rational r2) {
		return new Rational(r1.numerator*r2.denominator,r1.denominator*r2.numerator);
	}
	
	public String toString() {
		return numerator + "/"+denominator;
	}
	
	public String Floating(int num) {
		double value = (double)numerator/denominator;
		double scale = 1.0;
		
		for( int i= 0; i< num; i++) {
			scale *=10;
		}
		double f_value = (int) (value*scale)/scale;
		return f_value + "";
	}
}

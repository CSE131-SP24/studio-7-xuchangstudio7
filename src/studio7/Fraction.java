package studio7;

public class Fraction {
	private int n;
	private int d;
	
	public Fraction(int numerator, int denominator) {
		n = numerator;
		d = denominator;
	}

	public String add(Fraction other) {
		int newN = other.n*d + n*other.d;
		int newD = other.d*d;
		return newN + "/" + newD;
	}
	
	public String multiply(Fraction other) {
		int newN = other.n*n;
		int newD = other.d*d;
		return newN + "/" + newD;
	}	
	
	public String recipricoal() {
		return d + "/" + n;
	}
	
	public String simplify() {
		int i;
		if (n>=d)
		{
			i = n;
		}
		else
		{
			i = d;
		}
		for(int a = i; n%a != 0 && d%a != 0; a--)
		{
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

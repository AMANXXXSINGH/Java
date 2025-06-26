package Lec4;

public class GCD_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 12;
		int divisor = 6;
		while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	}

}

package Lec5;

public class Bin_To_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=101011;
		int sum =0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*mul;
			n=n/10;
			mul=mul*2;
		}
		System.out.println(sum);

	}

	}



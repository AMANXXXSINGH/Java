package Lec5;

import java.util.Scanner;

public class Print_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int mul = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			
			sum = sum + rem * mul;
			mul = mul * 2;
		}

		System.out.println(sum);

	}

}

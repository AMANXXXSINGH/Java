package Lec5;

import java.util.Scanner;

public class Boston_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int i = 2;
		int sum1 = 0;
		int sum2 = 0;
		while (i <= n) {
			if (n % i == 0) {
				n = n / i;
				sum1 = sum1 + i;

			} else {
				i++;
			}
		}

		n = temp;
		while (n > 0) {
			int rem = n % 10;

			n = n / 10;
			sum2 = sum2 + rem;

		}

		if (sum1 == sum2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}

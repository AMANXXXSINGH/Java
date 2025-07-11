package Assignment_3_Arrays;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		name(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void name(int[] arr) {
for (int j = 0; j < arr.length; j++) {
			int sum = 0;
			int mul = 1;
			while (arr[j] > 0) {
				int rem = arr[j] % 10;
				sum = sum + rem * mul;

				arr[j] = arr[j] / 10;
				mul = mul * 2;
	}
			arr[j] = sum;
		}
	}
}

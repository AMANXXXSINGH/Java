package Assignment_3_Arrays;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int Q = sc.nextInt();
		int[] operation = new int[Q];
		for (int i = 0; i < operation.length; i++) {
			operation[i] = sc.nextInt();
		}
		name(arr, operation);
	}

	public static void name(int[] arr, int[] operation) {
		int[] temp = new int[arr.length];
		for (int i = 0; i < operation.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int X = operation[i] % arr.length;
				if (j - X < 0) {
					temp[j] = arr[j] + arr[arr.length + (j - X)];
				} else {
					temp[j] = arr[j] + arr[j - X];
				}
			}
			for (int k = 0; k < arr.length; k++) {
				arr[k] = temp[k];
			}
		}
double ans = 0;
		for (int i = 0; i < temp.length; i++) {
			ans = ans + temp[i];
		}
		System.out.println((int)ans%(Math.pow(10, 9)+7));
}
}

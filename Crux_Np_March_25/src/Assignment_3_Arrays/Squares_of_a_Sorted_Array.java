package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Squares_of_a_Sorted_Array {

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
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] name(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];

		}
		Arrays.sort(arr);
		return arr;
	}
}

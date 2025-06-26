package Lec7;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Triplets {

	public static void main(String args[]) {
		TargetSum();
	}

	public static void TargetSum() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		Arrays.sort(arr);
		int i;
		for (i = 0; i < arr.length; i++) {
			int s = tar - arr[i];

			for (int j = 1 + i; j < arr.length; j++) {

				for (int k = 2 + i; k < arr.length; k++) {
					if (j >= k) {
						continue;
					}
					if (arr[k] + arr[j] == s) {

						System.out.println(arr[i] + "," + arr[j] + " and " + arr[k]);
					}

				}
			}
		}
	}
}
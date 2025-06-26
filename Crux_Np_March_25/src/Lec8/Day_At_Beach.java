package Lec8;

import java.util.*;

public class Day_At_Beach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Blocks(arr));

	}

	public static int Blocks(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				break;
			}
			if (arr[i] < arr[i + 1]) {
				count++;
				if (i == 0) {
					continue;
				}
				if (arr[i + 1] < arr[i - 1]) {
					count--;
				}
			}
		}
		return count;
	}
}

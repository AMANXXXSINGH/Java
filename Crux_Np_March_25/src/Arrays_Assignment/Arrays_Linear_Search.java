package Arrays_Assignment;

import java.util.Scanner;

public class Arrays_Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TargetIndex()); 
	}

	public static int TargetIndex() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == tar) {
				return i;
			}

		}
		return -1;
	}

}

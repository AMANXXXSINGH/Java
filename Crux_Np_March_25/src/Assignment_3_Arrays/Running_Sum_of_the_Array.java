package Assignment_3_Arrays;

import java.util.Scanner;

public class Running_Sum_of_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for (int i = 0; i < arr.length; i++) {
	arr[i] = sc.nextInt();
}
name(arr);
	}
public static void name(int []arr) {
	for (int i = 1; i < arr.length; i++) {
		arr[i]=arr[i]+arr[i-1];
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
}

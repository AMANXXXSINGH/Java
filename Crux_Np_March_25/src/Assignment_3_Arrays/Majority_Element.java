package Assignment_3_Arrays;

import java.util.Scanner;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
System.out.println(name(arr));
	}
public static int name(int[]arr) {
	int []arr2=new int[10];
	for (int i = 0; i < arr.length; i++) {
		arr2[arr[i]]+=1;
		
	}
	int max=Integer.MIN_VALUE;
	
	for (int i = 0; i < arr2.length; i++) {
		max=Integer.max(max, arr2[i]);
		
	}
	for (int i = 0; i < arr2.length; i++) {
		if(arr2[i]==max) {
			return i;
		}
	}
	return -1;
}
}

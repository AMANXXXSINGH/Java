package Assignment_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pairs();
	}
	public static void pairs() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
			for(int j=1+i;j<arr.length;j++) {
			if(arr[i]+arr[j]==tar) {
				System.out.println(arr[i]+" and "+arr[j]);
			}
		}}
		
	}

}

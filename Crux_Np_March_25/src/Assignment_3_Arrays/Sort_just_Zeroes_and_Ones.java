package Assignment_3_Arrays;

import java.util.Scanner;

public class Sort_just_Zeroes_and_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int [] arr2=new int[arr.length];
		name(arr,arr2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}
public static void name(int[] arr,int[] arr2) {
	
	int num=0;
	int count=0;
	for (int i = 0; i < 2; i++) {
		
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==num) {
					arr2[count]=arr[j];
					count++;
			}
		}
			num=1;
	}
}
}

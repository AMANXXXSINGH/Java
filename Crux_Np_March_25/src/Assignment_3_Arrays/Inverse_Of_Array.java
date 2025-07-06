package Assignment_3_Arrays;

import java.util.Scanner;

public class Inverse_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}

int []arr1=new int[arr.length];
int i=0;
Inverse(arr, i, arr1);
for (int j = 0; j < arr1.length; j++) {
	System.out.print(arr1[j]+" ");
}
	}
public static int[] Inverse(int[]arr,int i,int[]arr1) {
	if(i==arr.length) {
		return arr1;
	}
	int elem=arr[i];
	arr1[i]=arr[arr[elem]];
	return Inverse(arr,i+1,arr1);
}
}

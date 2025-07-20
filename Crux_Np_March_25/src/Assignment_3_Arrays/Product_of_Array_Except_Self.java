package Assignment_3_Arrays;

import java.util.Scanner;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int [] arr= new int [n];
		for(int j=0;j<n;j++) {
			arr[j]=sc.nextInt();
		}

int[]result=name(arr);
for (int a:result) {
	System.out.print(a+" ");
}
	}
public static int[] name(int []arr) {
	int []mul=new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		int ans=1;
		for (int j = 0; j < arr.length; j++) {
			if (j==i) {
				continue;
			}
			ans=ans*arr[j];
		}
		mul[i]=ans;
	}return mul;
}
}

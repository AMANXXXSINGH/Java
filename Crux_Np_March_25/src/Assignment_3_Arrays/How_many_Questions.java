package Assignment_3_Arrays;

import java.util.Scanner;

public class How_many_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<3;j++) {
			arr[i][j] = sc.nextInt();}
		}
name(arr);
	}
public static void name(int [][]arr) {
	
	int question=0;
	for (int i = 0; i < arr.length; i++) {
		int count=0;
		for (int j = 0; j < 3; j++) {
			if(arr[i][j]==1) {
				count++; 
			}
			if(count==2) {
				question++;
				break;
			}
		}
		
	}
	System.out.println(question);
}
}

package Lec12;
import java.util.*;
public class User_Input_Two_2_D_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //row
		int m=sc.nextInt(); //column
		int [][] arr=new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
 Display(arr);
	}
public static void Display(int [][] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}

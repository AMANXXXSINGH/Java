package Lec5;

import java.util.Scanner;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,i=0;
		int c=0;
		while(i<n) {
			c=a+b;
			
			a=b;
			b=c;
			i++;
			
		}
		
		System.out.println(a);
	}

}

package Lec5;

import java.util.Scanner;

public class Conversion_FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int step=sc.nextInt();
		for(int i=min;i<=max;i+=step) {
			int c=(5*(i-32))/9;
			System.out.print(i+"\t");
			System.out.print(c);
			System.out.println();
		}

	}

}

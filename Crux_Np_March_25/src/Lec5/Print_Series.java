package Lec5;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n=1;
		int n2=sc.nextInt();
		int count=1;
		for(int i=1;;i++) {
			int series=(3*i+2);
			if(series%n2!=0) {
				System.out.println(series);
				count++;
				if(count>10) {
					break;
				}
			}
		}
		

	}

}

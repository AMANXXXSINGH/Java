package Lec2;

import java.util.Scanner;

public class Pattern_Hollow_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=100){int row = 1;
		int space = n - 1;
		int star = n;

while (row <= n) {
			// space
			int i = 1;
			if(row==1) {
				space=4;
				star=5;
			}
			
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			i = 1;

			while (i <= star) 
			{
				if ( row == n) {

					System.out.print("* ");
				}
				else if(row==1) {
					System.out.print("* ");
				}
				else {
					if (i == 1 || i == n) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				i++;
				

			}
			space=n-row;
			star=n;
			space--;
			

			// next line
			System.out.println();
			row++;

		
}
    }

	}
}

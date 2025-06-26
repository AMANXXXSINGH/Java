package Lec2;

import java.util.Scanner;

public class Pattern_Mirror_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n/2 ;
		int star = 1;
		 
			while (row <=  n )
			{
				// space
				int i = 1;

				while (i <= space)
				{
					System.out.print("  ");
					i++;
				}
				// star
				i = 1;
				while (i <= star)
				{
					System.out.print("* ");
					i++;
				}
				// mirroring
				if (row < n/2+1)
				{
					star += 2;
					space--;
				} 
				else 
				{
					star -= 2;
					space++;
				}
				// next line
				System.out.println();
				row++;

			}
		

	}
}

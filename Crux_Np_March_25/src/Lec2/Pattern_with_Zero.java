package Lec2;

import java.util.Scanner;

public class Pattern_with_Zero {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while (row <= n) 
		{
			// star
			int i = 1;
			while (i <= star) 
			{
				if (i == 1 || i == row)
				{
					System.out.print(row + "\t");
					i++;
				} 
				else 
				{
					System.out.print("0" + "\t");
					i++;
				}
			}
			// next line
			System.out.println();
			row++;
			star++;
		}

	}

}

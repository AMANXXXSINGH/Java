package Lec2;

import java.util.Scanner;

public class Pattern_Inverted_Hour_Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int space = 2 * n - 1;
		int star = 1;

		while (row <= 2 * n + 1) {

			// star
			int count = n;
			int j = 1;
			while (j <= star) {

				System.out.print(count + " ");

				j++;
				count--;
			}

			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star
			int k = 1;
			int p = count+1 ;
			if (row == n + 1) {
				k = 2;
				p=count+2;
			}
			while (k <= star) {

				System.out.print(p + " ");
				p++;
				k++;
			}
			// mirroring
			if (row <= n) {
				space -= 2;
				star++;
				p--;
			} else {
				space += 2;
				star--;
				p--;
			}
			// next line
			System.out.println();

			row++;
		}

	}

}

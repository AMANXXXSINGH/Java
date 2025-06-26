package Lec2;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = n - 1;
		int row = 1;
		int val = 1;
		while (row <= 2 * n - 1) {
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("\t");
				j++;
			}
			// star
			int i = 1;
			int p = val;
			while (i <= star) {
				System.out.print(p + "\t");
				if(i<=star/2) {
					p++;
				}
				else {
					p--;
				}
				i++;
			}
			// mirror
			if (row < n) {
				space--;
				star += 2;
				val++;
			} else {
				space++;
				star -= 2;
				val--;
			}
			System.out.println();
			row++;
		}

	}

}

package Lec2;
import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2 * n - 3;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print(i + " ");
				i++;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			// star
			int k = 1;
			int count = row;
			if (row == n) {
				k = 2;
				count = row - 1;
			}

			while (k <= star) {

				System.out.print(count + " ");
				k++;
				count--;

			}
			// next line
			System.out.println();
			row++;
			star++;
			space -= 2;
		}
	}

}

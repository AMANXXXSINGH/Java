package Lec2;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = 2 * n - 3;
		int star = 1;
		while (row <= n) {

			// star
			int j = 1;
			while (j <= star) {

				System.out.print("* ");

				j++;
			}
			
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star
			int k = 1;
			if(row==n) {
				k=2;
			}
			while (k <= star) {

				System.out.print("* ");

				k++;
			}
			
			// next line
			System.out.println();
			space -= 2;
			star++;
			row++;
		}

	}

}

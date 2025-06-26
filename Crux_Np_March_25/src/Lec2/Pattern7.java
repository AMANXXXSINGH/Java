package Lec2;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		while (row <= n) {
			// star
			int i = 1;
			if (row == 1 || row == n) {
				while (i <= star) {
					System.out.print("* ");
					i++;
				}
				
			}
			// next line
			System.out.println();
			row++;

		}

	}

}

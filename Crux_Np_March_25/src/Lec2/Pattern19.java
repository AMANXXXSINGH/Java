package Lec2;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int star = n / 2+1;
		int space = -1;
		int row = 1;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				
				System.out.print("* ");
				i++;
			}
			// space
			i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			i = 1;
			if(row==1||row==n) {
				i=2;
			}
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// mirror
			if (row >= n / 2 + 1) {
				star++;
				space -= 2;
			} else {
				star--;
				space += 2;
			}
			// next line
			System.out.println();
			row++;
		}
	}

}

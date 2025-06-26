package Lec2;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n-1;
		int star = 1;
		int j=1;
		while (row <= n) {
			
			// space
			int i = 1;

			while (i <= space) {
				System.out.print("\t");
				i++;
				
			}
			// star
			i = 1;
			while (i <= star) {
				System.out.print(j+"\t");
				i++;
				j++;
			}
			// next line
			System.out.println();
			row++;
			star+=2;
			space --;
			

		}
		

	}

}

package Lec2;

public class Pattern_Hour_Glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5
				;
		int star = 2*n+1;
		int space = 0;
		int row = 1;
		int count = n;
		while (row <= 2*n+1) {
			// space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i = 1;
			int p=count;
			while(i<=star) {
				System.out.print(p+" ");
				
				if(i<=star/2 ) {
					p--;
				}
				else {
					p++;
				}
				i++;
			}
			
			
			// next line
			if(row<=n) {
			star-=2;
			space++;
			count--;}
			else {
				star+=2;
				space--;
				count++;
			}
			System.out.println();
			row++;

		}

	}

}

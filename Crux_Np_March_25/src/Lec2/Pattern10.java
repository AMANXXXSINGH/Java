package Lec2;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int space=0;
		int star=(2*n)-1;
		while(row<=n) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//next line
			System.out.println();
			space++;
			star-=2;
			row++;
		}

	}

}

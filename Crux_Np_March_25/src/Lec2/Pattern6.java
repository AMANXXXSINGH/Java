package Lec2;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int space=0;
		int star=n;
		while(row<=n) {
			//space
			int i=1;
			
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//next line
			System.out.println();
			row++;
			star--;
			space+=2;
			
		}
		

	}

}

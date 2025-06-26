package Lec2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int row=1;
		int star=1;
		
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//next line prep
			System.out.println();
			row++;
			star++;
		}

	}

}

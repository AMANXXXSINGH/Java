package Lec2;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int row=1;
		int space=0;
		int star=5;
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
			if(row>5) {
				space-=2;
				star++;
			}
			else {
			star--;
			space+=2;}
			
		}
		


	}

}

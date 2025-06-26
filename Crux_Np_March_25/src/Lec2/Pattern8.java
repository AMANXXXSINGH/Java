package Lec2;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int space=0;
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//space
			int j=1;
			while(j<=space) {
				if(row==1||row==5) {
				System.out.print("      ");	
				}
				else {
				System.out.print("  ");
				j++;}
			}
			
			//star
			int k=1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			//next line 
			System.out.println();
			row++;
			
		}

	}

}

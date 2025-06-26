package Lec2;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int row=1;
		int star=1;
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//next line 
			System.out.println();
			row++;
			if(row>5) {
				star--;
			}
			else {
			star++;}
		}


	}

}

package Lec2;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int space=n-1;
		int star=1;
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
				if(i%2!=0) {
				System.out.print("* ");}
				else {
					System.out.print("! ");
				}
				i++;
			}
			//next line
			System.out.println();
			space--;
			star+=2;
			row++;
		}

	}

}

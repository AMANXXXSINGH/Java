package Lec2;

public class Pattern_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int row=1;
		int star=1;
		int a=0;
		int b=1;
		while(row<=n) {
			//star
			int i=1;
			
			while(i<=star) {
				System.out.print(a+" ");
				i++;
				int next=a+b;
				a=b;
				b=next;
			}
			//next line prep
			System.out.println();
			row++;
			star++;
		}
	}

}

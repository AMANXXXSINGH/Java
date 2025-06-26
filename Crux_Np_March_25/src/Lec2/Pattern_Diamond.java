package Lec2;
import java.util.Scanner;
public class Pattern_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		 if (n > 0 && n < 10 && n% 2 != 0) {
             // Valid input, exit loop
         int row=1;
		int star=n/2+1;
		int space=-1;
		while(row<=2*(n/2+1)-1) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			//space
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			//star
			int k=1;
			if(row==1||row==2*(n/2+1)-1) {
				k=2;
			}
			while(k<=star) {
				System.out.print("*");
				k++;
			}
			//mirroring
			if(row<n/2+1) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			//next line prep
			System.out.println();
			row++;
		}
         }

	}

}

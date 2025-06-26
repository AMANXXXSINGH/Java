package Lec5;
import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int even=0,odd=0;
		int temp=n;
		int count=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		for(int i=0;i<count;i++) {
			int rem=n%10;
			n=n/10;
		if(i%2==0) {
			 even=even+rem;
		}
		else {
			odd=odd+rem;
		}
			}
		System.out.println(even);

		System.out.println(odd);
	}

}

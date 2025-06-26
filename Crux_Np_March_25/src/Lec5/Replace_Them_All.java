package Lec5;
import java.util.Scanner;
public class Replace_Them_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long sum=(long)0;
		long mul=(long)1;
		while(n>0){
			long rem=(long)(n%10);

		n=n/10;
		if(rem==0){
		    rem=5;
		}
		sum=sum+rem*mul;
		mul=mul*10;
		}
		 System.out.println(sum);
	}

}

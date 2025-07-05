package Assignment_5_String;

import java.util.Scanner;

public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans="";


oddEvenCharacter(str, ans);
	}
public static void oddEvenCharacter(String str,String ans) {
	//even
	for (int i = 0; i< str.length(); i++) {
		if(i%2==0) {
			char ch2=(char) (str.charAt(i)+1);
			ans=ans+ch2;
		}
		
		if(i%2!=0) {
			char ch2=(char) (str.charAt(i)-1);
			ans=ans+ch2;
		}
	}
	System.out.println(ans);
	
}
}

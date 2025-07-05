package Assignment_5_String;

import java.util.Scanner;

public class Strings_Difference_in_Ascii_Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
name(str);
	}
public static void name(String str) {
	String ans="";
	ans=ans+str.charAt(0);
	for (int i = 1; i < str.length(); i++) {
		int diff=str.charAt(i)-str.charAt(i-1);
		
		ans=ans+diff+str.charAt(i);
	}System.out.println(ans);
}
}

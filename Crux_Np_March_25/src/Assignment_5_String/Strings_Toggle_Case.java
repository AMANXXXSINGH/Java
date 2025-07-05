package Assignment_5_String;

import java.util.Scanner;

public class Strings_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
String str=sc.next();
String ans="";
ToggleCase(str, ans);
	}
public static void ToggleCase(String str,String ans) {
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)>64&&str.charAt(i)<91) {
			char ch=(char) (str.charAt(i)+32);
			ans= ans+ch;
			
		}
		if(str.charAt(i)>96&&str.charAt(i)<123) {
			char ch2=(char) (str.charAt(i)-32);
			ans=ans+ch2;
		}
		
	}
	System.out.println(ans);
}
}

package Assignment_5_String;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sx=new Scanner(System.in);
String str=sx.next();
StringCompression(str);

	}
public static void StringCompression(String str) {
	int count=0;
	String ans="";
	String ans2="";
	for (int i = 0; i <str.length(); i++) {
		count++;
		
		if(i>0) {
		if (str.charAt(i)!=str.charAt(i-1)) {
			
			ans=ans+str.charAt(i-1)+(count-1);
			count=1;
		}}
		if(i==str.length()-1) {
			ans=ans+str.charAt(i)+(count);
		}
		
		
	}
	for (int j = 0; j < ans.length(); j++) {
		if(ans.charAt(j)!='1') {
			ans2=ans2+ans.charAt(j);
		}
	}
	System.out.println(ans2);
}
}

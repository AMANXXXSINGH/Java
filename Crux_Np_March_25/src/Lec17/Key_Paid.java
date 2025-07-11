package Lec17;

import java.util.ArrayList;
import java.util.List;

public class Key_Paid {
static String[] key= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
String ques="23";
List<String> ll=new ArrayList<>();
F(ques,ll,"");
System.out.println(ll);
	}
public static void F(String ques,List<String>ll,String ans) {
	if(ques.length()==0) {
		ll.add(ans);
		return;
	}
	char ch=ques.charAt(0);
	String press=key[ch-'0']; // abc
	for (int i = 0; i < press.length(); i++) {
		F(ques.substring(1),ll,ans+press.charAt(i));
	}
}
}

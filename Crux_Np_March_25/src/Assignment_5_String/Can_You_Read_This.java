package Assignment_5_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//65-90
		Scanner sc=new Scanner(System.in);
		String ans;
		ans="";
		List<String>ll=new ArrayList<>();
		String a=sc.next();
		for (int i = 0; i < a.length(); i++) {
			
			if(a.charAt(i)<=90 && a.charAt(i)>=65) {
				ans="";
				ans=ans+a.charAt(i);
				
			}
			
			else {	ans=ans+a.charAt(i);
			ll.remove(ll.size()-1);
			
			}
			
			ll.add(ans);
			
		}
		for (String val:ll) {
			System.out.println(val);
		}
		
	}

}

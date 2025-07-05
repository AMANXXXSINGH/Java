package Assignment_5_String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		String str="";
		List<String>ll=new ArrayList<>();
		
        for(int i=0;i<n;i++){
           str=str+sc.next();
		}
       
		for (int i = 1; i <= str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				String num=str.subSequence(j, i);
				if(isCN()==true)
				 {
                  ll.add(str.subSequence(j, i));
				
                  }
			}
		}

	}
	public static boolean isCN(int str) {
		
		int[] ll1= {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		for (int i = 0; i < ll1.length; i++) {
			int numFromString= str-'0';
			if(str==ll1[i]){
				return true;
			}
			if ((str%ll1[i])==0) {
				return true;
			}
			if(str==1||str==0) {
				return false;
			}
			
		}return false;
	}

}

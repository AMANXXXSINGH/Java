package Assignment_5_String;

import java.util.Scanner;

public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int []arr=new int[52];
String st=sc.next();
System.out.println(name(arr, st));;
	}
public static char name(int[]arr,String st) {
	
	for (int i = 0; i < st.length(); i++) {
		int alphabet=st.charAt(i);
		if(alphabet>=97 && alphabet<=122) {int indx=st.charAt(i)-'a';
		arr[indx]+=1;
	}else  {
		int indx=st.charAt(i)-'A';
		arr[indx+26]+=1;
	}
		}
	int max=Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
	
	  max=Math.max(max, arr[i]);
	 		
	}
char ans = 0 ;
for (int i = 0; i < arr.length; i++) {
	if(arr[i]==max && i>=0&& i<=25) {
		ans=(char) (i+'a');
	}
	else if(arr[i]==max){
		ans=(char) (i+'A'-26);
	}
}
	
	return ans;
}
}

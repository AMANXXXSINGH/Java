package Assignment_5_String;

public class Playing_with_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="cbaeicde";
String ans="";
int i=0;

System.out.println(F(str,ans,i));
	}
public static String F(String str,String ans,int i) {
	
	if(i==str.length()) {
		return ans;
	}
	
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	{
		return F(str,ans+str.charAt(i),i+1);
	}
	return F(str,ans,i+1);
}
}

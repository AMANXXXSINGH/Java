package Lec13;

public class String_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		String s4=new String("Hello");
		s1=s1+" bye";
System.out.println(s1);
s3=s3.concat("Okay");
String s5="raju"+"kaju";
String s6="rajukaju";
System.out.println(s5==s6); //immutable - address pe change nhi kr skte 
//uski copy bana ke hi copy me change hota hai
System.out.println(s6.charAt(2));
int [] arr=new int [6];
System.out.println(arr.length);
System.out.println(s5.length());
	}

}

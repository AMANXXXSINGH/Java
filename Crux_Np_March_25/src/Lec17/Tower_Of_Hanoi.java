package Lec17;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
F(n,"A","B","C");
	}
public static void F(int n,String src,String hel,String des) {
	if(n==0) {
		return;
	}
	F(n-1,src,des,hel);
	System.out.println(n+"th Block is moved from "+src+" to "+des);
	F(n-1,hel,src,des);
}
}

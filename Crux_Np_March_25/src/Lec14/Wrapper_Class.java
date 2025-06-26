package Lec14;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		Integer a1=12;
		System.out.println(a);
		System.out.println(a1);
		a1=a;//stack ka variable heap me gya// auto-boxing
		Integer a2=9;
		int b=a2;// un-boxing
		long b1=a2;
		Long a3=99l;
		Double d=45d;
		Double d1=45d;
		System.out.println(d==d1);

	}

}

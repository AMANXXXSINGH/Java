package Lec5;

public class Conversion_AnytoAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0,sum2=0;
		int mul = 1;
		while (n > 0) {

			int rem = n % 10;
			sum = sum + rem * mul;
			n = n / 10;
			mul = mul * a;
		}
		
		mul = 1;
		
		while (sum > 0) {

			int rem = sum % b;
			sum2 = sum2 + rem * mul;
			sum = sum / b;
			mul = mul * 10;
		}
		System.out.println(sum2);

	}

}

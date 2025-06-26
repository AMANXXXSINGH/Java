package Lec4;

public class Check_Prime_using_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 981111111;
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
				break;
			}

		}
		if (count >= 1) {
			System.out.println(n);

		} else {
			System.out.println("prime");
		}
	}

}

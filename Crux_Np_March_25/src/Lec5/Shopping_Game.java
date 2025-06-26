package Lec5;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = 2;
		int mi;
		int ni;
		while (t > 0) {
			mi = sc.nextInt();
			ni = sc.nextInt();
			int m = mi;
			int n = ni;
			int z;
			if (m >= n) {
				z = m;
			} else {
				z = n;
			}
			for (int i = 1; i <= z / 2; i++) {
				if (i % 2 != 0) {
					m = m - i;
					if (m <= 0) {
						break;
					}
				} else {
					n = n - i;
					if (n <= 0) {
						break;
					}
				}
			}
			if (m <= 0) {
				System.out.println("Harshit");
			}
			if (n <= 0) {
				System.out.println("Ayush");
			}
			t--;
		}
	}
}

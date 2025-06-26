package Lec1;

public class Lottery_Game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 18;
		if (a >= 15 && a < 21) {
			System.out.println("Bike");
			if (a >= 15 && a <= 18) {
				System.out.println("Hero");
			} else {
				System.out.println("KTM");
			}
		} else if (a >= 50 && a < 81) {
			System.out.println("Cycle");
			if (a >= 50 && a <= 72) {
				System.out.println("Automatic Cycle");
			} else {
				System.out.println("Manual Cycle");
			}
		} else if (a >= 100 && a < 201) {
			System.out.println("Car");
			if (a >= 100 && a <= 130) {
				System.out.println("Thar");
			} else {
				System.out.println("Creta");
			}
		} else if (a >= 250 && a < 301) {
			System.out.println("Mac");
			if (a >= 250 && a <= 280) {
				System.out.println("M1");
			} else {
				System.out.println("M");
			}

		} else if (a >= 1200 && a < 1401) {
			System.out.println("Kurkure");
		} else {
			System.out.println("Happy Birthday");
		}

	}

}

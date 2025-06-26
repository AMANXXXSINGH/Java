package Lec1;

public class Lottery_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 87;
		if (a >= 15 && a < 21) {
			System.out.println("Bike");
		} else if (a >= 50 && a < 81) {
			System.out.println("Cycle");
		} else if (a >= 100 && a < 201) {
			System.out.println("Car");
		} else if (a >= 250 && a < 301) {
			System.out.println("Mac");

		} else if (a >= 1200 && a < 1401) {
			System.out.println("Kurkure");
		} else {
			System.out.println("Happy Birthday");
		}

	}

}

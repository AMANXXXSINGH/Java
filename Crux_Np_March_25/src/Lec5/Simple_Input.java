package Lec5;
import java.util.*;
public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		NumList(arr);
	}

	public static int[] NumList(int[] arr) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 0;
		while (sum >= 0) {
			int num = arr[i];
			sum = sum + num;
			if (sum < 0) {
				break;
			}
			System.out.println(num);
			i++;
		}
		return arr;
	}

}

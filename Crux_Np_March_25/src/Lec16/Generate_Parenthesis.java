package Lec16;
import java.util.*;
public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		Parenthesis(n, 0, 0, "",ll);
		System.out.println(ll);
	}

	public static void Parenthesis(int n, int open, int closed, String ans, List<String> ll) {
		if (open == n && closed == n) {
//			System.out.println(ans);
			ll.add(ans);
			return;
		}
		if (open > n || closed > open) {
			return;
		}

		Parenthesis(n, open + 1, closed, ans + "(",ll);
		Parenthesis(n, open, closed + 1, ans + ")",ll);
	}

}

package Lec18;

import java.util.ArrayList;
import java.util.List;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {2,3,6,7};
		int amount=7;
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>>ans=new ArrayList<>();
		Combination(coin,amount,0,ll,ans);
		System.out.println(ans);
	}
	public static void Combination(int [] coin ,int amount,int idx,List<Integer>ll,List<List<Integer>>ans) {
		if(amount==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if(amount>=coin[i]) {
				ll.add(coin[i]);
				Combination(coin, amount-coin[i],i,ll,ans);
				ll.remove(ll.size()-1);
			}
		}
	}
}

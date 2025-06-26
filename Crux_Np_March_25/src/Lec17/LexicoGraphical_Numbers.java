package Lec17;

import java.util.ArrayList;
import java.util.List;

public class LexicoGraphical_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=43;
List<Integer> ll=new ArrayList<>();
Lexi(2,n,ll);
for (int j = 0; j < ll.size(); j++) {
	System.out.println(ll.get(j));
}


	}
public static void Lexi(int curr,int n,List<Integer> ll) {
	if(curr>n) {
		return;
	}
	ll.add(curr);
	int i=0;
	if(curr==0) {i=1;}
	for(;i<=9;i++) {
		Lexi(curr*10+i,n,ll);
	}
}
}

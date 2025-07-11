package Assignment_3_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pair_of_Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		List<List<Integer>>dll2=new ArrayList<>();
		for (int i = 0; i < t; i++) {
			int n=sc.nextInt();
			int[] arr= new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j]=sc.nextInt();
			}
			int tar=sc.nextInt();
			System.out.println();
			
			Arrays.sort(arr);
			List<Integer>ll=new ArrayList<>();
			List<List<Integer>>dll=new ArrayList<>();
			
			
			dll2.add(name(arr, tar, ll, dll));
		}
		
		for(List<Integer>ll2:dll2) {
		System.out.println("Deepak should buy roses whose prices are "+ll2.get(0)+" and "+ll2.get(1)+".");
		}
		sc.close();

	}
public static List<Integer> name(int[]arr,int tar,List<Integer>ll,List<List<Integer>>dll) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			int remaining=tar-arr[i];
			
			if (arr[j]==remaining) {
				ll.add(arr[i]);
				ll.add(arr[j]);
				
				dll.add(new ArrayList<Integer>(ll));
				ll.clear();
			}
			
			
			
			
		}
	}
	int[] diff=new int[dll.size()];
	for (int i = 0; i < dll.size(); i++) {
		List<Integer> clonell=new ArrayList<>();
		
		clonell=dll.get(i);
		diff[i]=Math.abs(clonell.get(0)-clonell.get(1));
		
	}
	List<Integer>ll2=new ArrayList<>();
	ll2=dll.get(minInArray(diff));
	
	return ll2;
	
	
}
public static int minInArray(int[] diff) {
	int minIndx=0;
	for (int i = 0; i < diff.length; i++) {
		if (diff[i]<diff[minIndx]) {
			minIndx=i;
		}
	}
	return minIndx;
}
}

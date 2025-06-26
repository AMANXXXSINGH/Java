package Lec7;

public class Array_Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,7,4,9,7};
		//int[] arr= new int[]{10,20,55,4};
		int item=7;
		System.out.println(Search(arr, item));

	}
	public static int Search(int[] arr,int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
			
				
			
		}
		return -1;}

}

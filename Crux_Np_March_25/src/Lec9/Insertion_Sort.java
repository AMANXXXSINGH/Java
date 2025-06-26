package Lec9;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,3,4,5,9,6,2};
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" "); 
			}
	}
	
	public static void Sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			Insert_Last_Element(arr,i);
		}
		
	}
	public static void Insert_Last_Element(int[] arr,int i) {//i-last index
		int j=i-1;
		int item=arr[i];
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			arr[j]=item;
			j--;
		}
		//pos--> j+1 bata deta hai
	}

}

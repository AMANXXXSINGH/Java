package Lec8;

public class Product_Array_Itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int [] a=Product_of_Array(arr);
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		

	}
	public static int[] Product_of_Array(int[] arr){
		int n=arr.length;
		int [] left = new int [n];
		left[0]=1;
		for(int i=1;i<left.length;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		int [] right = new int [n];
		right[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
			
		}
		for(int i=0;i<right.length;i++) {
			left[i]=left[i]*right[i];		}
		return left;	
	}
	

}

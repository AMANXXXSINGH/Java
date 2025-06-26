package Lec7;

public class Sum_Array_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		System.out.println(Sum(arr));
		
	}
public static int Sum(int[] arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	return sum;
}
}

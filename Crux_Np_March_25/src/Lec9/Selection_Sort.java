package Lec9;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,-1,5,3,1,2};
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			
		
		System.out.print(arr[i]+" "); 
		}

	}
	public static void Sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int idx=Minimum_Index(arr,i);
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
	}
	public static int Minimum_Index(int[] arr,int idx) {
		int min=idx;
		for(int i=idx+1;i<arr.length;i++) {
			if(arr[min]>arr[i]) {
				min=i;
			}
		}
		return min;
	}

}

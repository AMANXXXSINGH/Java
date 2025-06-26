package Lec8;

public class Partition_Array_Into_Disjoint_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int[] arr= {1,1,1,0,6,12};
				System.out.println(Partition(arr));

			}
			public static int Partition(int[] arr) {
				int n=arr.length;
				int count=1;
				int[] left= new int [n];
				left[0]=arr[0];
				for(int i=1;i<left.length;i++) {
					left[i]=Math.max(left[i-1], arr[i]);
				}
				int[] right=new int [n];
				right[n-1]=arr[n-1];
				for(int i=n-2;i>=0;i--) {
					right[i]=Math.max(right[i+1],arr[i]);
				}
				int[] sum=new int[arr.length];
				for(int i=0;i<right.length;i++) {
					sum[i]=left[i]-right[i];
				}
				for(int i=0;i<arr.length;i++) {
					if(i==arr.length-1) {
						break;
					}
				if(sum[i]==sum[i+1]) {
					count++;
				}
				 }
				return count;

	}

}

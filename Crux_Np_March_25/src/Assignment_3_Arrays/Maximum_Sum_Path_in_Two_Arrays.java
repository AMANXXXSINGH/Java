package Assignment_3_Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int []result=new int[t];
		for (int i = 0; i < t; i++) {
			int m=sc.nextInt();
			int n=sc.nextInt();
			int[] arr1=new int[m];
			int[] arr2=new int [n];
			for (int j = 0; j < m; j++) {
				 arr1[j]=sc.nextInt();
			}
			for (int j = 0; j < n; j++) {
				 arr2[j]=sc.nextInt();
			}
			result[i]=name(arr1, arr2); 
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
	public static int name(int[] arr1, int[] arr2) {
	    int sum1 = 0, sum2 = 0;
	    int i = 0, j = 0;
	    int result = 0;

	    while (i < arr1.length && j < arr2.length) {
	        if (arr1[i] < arr2[j]) {
	            sum1 += arr1[i++];
	        } else if (arr2[j] < arr1[i]) {
	            sum2 += arr2[j++];
	        } else {
	            // common element
	            result += Math.max(sum1, sum2) + arr1[i]; // or arr2[j]
	            sum1 = 0;
	            sum2 = 0;
	            i++;
	            j++;
	        }
	    }

	    // Add remaining elements in arr1
	    while (i < arr1.length) {
	        sum1 += arr1[i++];
	    }

	    // Add remaining elements in arr2
	    while (j < arr2.length) {
	        sum2 += arr2[j++];
	    }

	    result += Math.max(sum1, sum2);

	    return result;
	}

}

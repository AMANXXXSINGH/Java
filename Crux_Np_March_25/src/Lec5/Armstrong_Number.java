package Lec5;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 1;
		int n2 = 1000;
		
		Armstrong(n1, n2);

	}

	public static void Armstrong(int n1, int n2) 
	{
		// no. of digits
		
		

		for (int i = n1; i <= n2; i++) 
		{
			int j = i; //j is temp
			int k=i;  // k is num
			int l=i;
			int count=0;
			int sum=0;
			
			// no. of digits
			while (j > 0) {
				j = j / 10;
				count++;
			}
			
			while (l > 0) 
			{
				int rem = l % 10;
				l=l/10;
				sum = (int) (sum + Math.pow(rem, count));
			}

			if (sum == k) 
			{
				
				System.out.println("");
				
			}
			

		}
		

    }

	}



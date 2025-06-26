package Lec5;

public class Armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      int count = 0;
				int sum = 0;
				int p=0;

				for (int i = 400; i <= 1000; i++) 
				{
					int j = i; //j is temp
					int k=i;  // k is num
					int l=i;
					count=0;
					sum=0;
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
						p = sum;
						System.out.println(p);
					}

				}
				

		    }
		

	}



package Lec5;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		int n1=371;
		Armstrong(n1);
	}
		// TODO Auto-generated method stub
		public static void Armstrong(int n1) 
		{
			// no. of digits
			
			

			
				int j = n1; //j is temp
				int k=n1;  // k is num
				int l=n1;
				int count=0;
				int sum=0;
				boolean a=true;
				
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
					
					System.out.println(a);
					
				}
				else {
					System.out.println(!a);
				}
				

			
			

	    
	}

}

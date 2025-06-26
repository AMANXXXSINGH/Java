package Lec2;

public class Pattern_Double_Sided_Arrow 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n-1;
		int space2=-1;
		int row=1;
		int count=row;
		int t=0;
		
		while(row<=n)
		{
			//space
			int i=1;
			while(i<=space) 
			{
				System.out.print("  ");
				i++;
			}
			//star
			count=row;
			int j=1;
			if(row>n/2+1) {
				count-=t;
				
			}
			while(j<=star)
			{
				
				System.out.print(count+" ");
				j++;
				count--;
			}
			//space
			int k=1;
			
			while(k<=space2)
			{
				System.out.print("  ");
				k++;
			}
			 
			//star
			if(row!=1 && row!=n)
			{
				int l=1;
				int count1=1;
			while(l<=star) {
				System.out.print(count1+" ");
				l++;
				count1++;
			}
			}
			//mirroring
			if(row<n/2+1) 
			{
				space-=2;
				star++;
				space2+=2;
				count++;
			}
			else 
			{   t+=2;
				space+=2;
				star--;
				space2-=2;
				count=row-1;
				
			}
			
			System.out.println();
			row++;
			
		}

	}

}

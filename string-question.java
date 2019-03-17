import java.util.*;
public class working {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int countspace=0,countwords=0,charcount,n,sum=0; 
		n=a.length();
		//char b[]=a.toCharArray();
		for(int i=0;i<n;i++)
		{
			if(a.charAt(i)==' ')
			{
				countspace++;
			}
			sum=sum+a.charAt(i);
		}
		// reverse strings
		System.out.print(" reverse string - ");
		for(int j=n-1;j>=0;j--)
		{
			//if(a.charAt(j)!=' ')
			//{
			System.out.print(a.charAt(j));
			//}
		}
		System.out.println("\n");
		countwords=countspace+1;
		charcount=n-countspace;
		
		System.out.println("words = "+countwords+" spaces = "+countspace+" charcount = "+charcount+" sum = "+sum);
	}
}

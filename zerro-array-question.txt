import java.util.*;
public class zeroarrques {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=-999,count=0;
		System.out.println("Enter size of array.");
		n=sc.nextInt();
		int a[]=new int[n]; // size of array
		System.out.println("Enter the elements of array.");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt(); // input array
		}
		while(sum!=0)
		{
			sum=0;
				for(int j=0;j<n;j++)
				{
					if(a[j]!=0)  
					{
						a[j]=a[j]-1; // subtracting 1 from array elements
						count++;
						for(int k=0;k<n;k++)
						{
							sum=sum+a[k]; 
						}
					}
					
				}
		}
		for(int x=0;x<n;x++)
		{
			System.out.println("Value at Index "+x+" is "+a[x]);
		}
		System.out.println("Number of subtractions = "+count);
	}
}

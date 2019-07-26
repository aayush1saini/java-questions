import java.util.*;
public class Main {
	
	public static void main(String[] args){
        int j=0,k=1,count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n+count;i++)
        {
            j=(3*k)+2; // value of j given in question
            k++;
            if(j%4==0)
            {
               count++;
            }
            else 
            {
                System.out.print(j+" ");
            }
               
            
        }
        

	}
}

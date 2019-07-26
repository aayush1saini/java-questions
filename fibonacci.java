import java.util.*;
public class Solution {


	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
        int a=1,b=1,term=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            term=a;
            a+=b;
            b=term;
        }
        System.out.print(b);
        

		
	}

}

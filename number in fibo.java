import java.util.*;
public class Solution {
	
	public static boolean checkMember(int n){
				int a=1,b=1,c,flag=0;
        c=0; // to begin the loop.
        while(c<=n) // finding num in fibonacci sequence
        {
            c=a+b;
            a=b;
            b=c;
            if(c==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
       // return true;
		
	
    }
}

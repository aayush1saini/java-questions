
public class Solution {

	
	public static void swapAlternate(int[] input){
		
			
        int i,c;
        for(i=0;i<input.length;i+=2)// i+=2 for alternate swapping
        {
            if(i!=input.length-1) // i is not equal to last index of array, or else array out of bounds
            {
              c=input[i];
              input[i]=input[i+1];
              input[i+1]=c;
            }  
        }
            

	}
	
}

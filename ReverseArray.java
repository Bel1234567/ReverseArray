import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseArray 
{

	public static void main(String[] args) 
	{
		//First input is the number of elements in the array.
		//Next consecutive inputs are the elements of that array.
		//The result is the reversed array.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++)
        {
            arr[arr_i] = in.nextInt();
        }
        
        ReverseArray rarr = new ReverseArray();
        int[] reversedArr = rarr.reverseeTheArray(arr.clone());
        String finalString = "";
        
        for(int i = 0; i < reversedArr.length; i++)
        {
        	if(i==0)
        	{
        		finalString = Integer.toString(reversedArr[i]);
        	}
        	else
        	{
        		finalString = finalString + " " + reversedArr[i];
        	}
        	
        }
        
    	System.out.println(finalString);
        
    }
	
	public int [] reverseeTheArray(int[] theArray)
	{	
		int[] reversedArray = new int [theArray.length];
		int indexAdded = 0;
		
		for(int i = theArray.length; i > 0; i--)
		{
			reversedArray[indexAdded] = theArray[i-1];
			indexAdded++;
		}
		
		return reversedArray;
	}

}

package PermutationCombination;

import java.util.ArrayList;
import java.util.List;

public class PermutationExample {
	static int fact(int number) {  
	      int f = 1;  
	      int j = 1;  
	      while(j <= number) {  
	         f = f * j;  
	         j++;  
	      }  
	      return f;  
	   }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      List<Integer> numbers = new ArrayList<Integer>();  
	        
	      numbers.add(12);  
	      numbers.add(13);  
	     
	        
	      int n = numbers.size();  
	      int r = 3;  
	      int result;  
	        
	      result = fact(n) / fact(n-r);  
	      System.out.println("The permutation value for the numbers list is: " + result);  

	}

}

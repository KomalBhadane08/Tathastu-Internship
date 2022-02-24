package PermutationCombination;

import java.util.ArrayList;
import java.util.List;

public class Combination {
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
	        
	      numbers.add(9);  
	      numbers.add(12);  
	    
	        
	      int n = numbers.size();  
	      int r = 2;  
	      int result;  
	        
	      result = fact(n) / (fact(r) * fact(n-r));  
	      System.out.println("The combination value for the numbers list is: " + result);  

	}

}

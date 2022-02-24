package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating an object of List interface with
        // reference to ArrayList
        List<Integer> al = new ArrayList<>();
 
        // Adding elements to ArrayList class
        // using add() method
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);
 
        System.out.println(al);
 
        al.remove(new Integer(1));
     
      
        al.remove(new Integer(2));
 
        System.out.println(al);

	}

}

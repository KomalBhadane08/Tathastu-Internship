package reverseletter;

public class reverseletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str= "komal", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("komal"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);

	}

}

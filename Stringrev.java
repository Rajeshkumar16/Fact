package Demo;

import java.util.Scanner;

public class Striinreverse {
	public static void main(String[] args)
	{
		String s1="Rajesh";
        String r=" ";
        Scanner in = new Scanner(System.in);
 
        System.out.println("Enter the string");
        s1 = in.nextLine();
 
      int len = s1.length();
 
      for ( int i = len - 1 ; i >= 0 ; i-- )
         r = r + s1.charAt(i);
 
      System.out.println("Reverse is: "+r);
   }

		
	}


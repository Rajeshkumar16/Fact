package Demo;

public class Duplicateeliminate 
{


	public static void main(String[] args) 
	{
		String s = "madam";
				
		StringBuffer b = new StringBuffer(s);
        
	

		for (int i = 0; i <b.length(); i++)
		{
			char c = b.charAt(i);
			for (int j =i+1; j <b.length(); j++) 
			{
				if (c== b.charAt(j))
				{
					b.deleteCharAt(j);
				} 
			}
			System.out.print(c);
		}
}
}

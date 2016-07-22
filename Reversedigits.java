package Demo;

public class Rverseadigit {
	public static void main(String[] args)
{
	int raj=1234;
	int n1=0;
	if(raj>0)
	 {
		while(raj>0)
		{
			n1=raj%10;
			System.out.println(n1);
			raj=raj/10;
		}
		
	  }
	} 
}

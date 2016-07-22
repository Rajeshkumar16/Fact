package Demo;

import java.util.Arrays;

public class leastnumbers {
	public static void main(String[] args)
	{
	int num=23456;
	String s1=""+num;
	String s2="";
	int len=s1.length();
	int i=0;
	int n1[]=new int[len];
	while(num>0)
	{
	
		n1[i]=num%10;
		
		num=num/10;
		i++;
	}

Arrays.sort(n1);
{
	for(int k=0;k<2;k++)
	{
		 s2=""+n1[0]+n1[1];
	
	}
	System.out.println(s2);
}
}
}

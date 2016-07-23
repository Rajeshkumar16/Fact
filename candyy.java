import java.util.Scanner;


public class candies {
   public static void main(String[] args) {
		System.out.println("Enter the number of childs");
		Scanner scr=new Scanner(System.in);
		int numofchild=scr.nextInt();
		int[] line=new int[numofchild];
		int sumofCandies=0;
		int candy[]=new int[numofchild];
		System.out.println("enter the rating");
		int rating=0;
		for(int i=0;i<line.length;i++)
		{
			rating=scr.nextInt();
			line[i]=rating;
		}
		
		System.out.println("Enter candies");
		int c=0;
		for(int k=0;k<candy.length;k++){
			c=scr.nextInt();
			candy[k]=c;
		}
		
		
		for(int j=0;j<line.length-1;j++){
			if(line[j+1]>line[j]){
				candy[j+1]+=candy[j];
			}
			else
				candy[j+1]=1;
			
		}
		for(int h=0;h<candy.length;h++){
			sumofCandies+=candy[h];
			
		}
		System.out.println("Minimum Candies Required:"+sumofCandies);
	
		scr.close();}

}

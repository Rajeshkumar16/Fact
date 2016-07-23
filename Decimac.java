import java.util.Arrays;
import java.util.Scanner;


public class Decimalvalue {


	public static void main(String[] args) {

	Scanner scr=new Scanner(System.in);
	System.out.println("Enter the size of array");
	double size=scr.nextDouble();
	   
		   double iArr[] =new double[(int) size];
		   System.out.println("enter the element");
		   for(int i=0;i<iArr.length;i++){
			   iArr[i]=scr.nextInt();
		   }


	   
	   Arrays.sort(iArr);

	   for(int j=iArr.length-1;j>=0;j--){
		   System.out.print(iArr[j]+" ");
	scr.close();   }
}}

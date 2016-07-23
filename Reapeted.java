public class Reapeted {


 public static void main(String[] args)
 {
  int num=0,count=0;
  System.out.println("Enter the number of elements  in array ");
  Scanner scr=new Scanner(System.in);
  int n=scr.nextInt();
  int[] Arr=new int[n];
  System.out.println("Enter the elements:");
  for(int i=0;i<n;i++)
   {
     Arr[i]=scr.nextInt();
    }
  for(int i=0;i<n;i++)
    { 
      if(count==0)
      {
         for(int j=i+1;j<n;j++)
         {
           if(Arr[i]==(Arr[j]))
            { 
              num=Arr[i];
              count+=1;
              break;
            }
         }
       }
                
      scr.close();
      }
  System.out.println("REPEATED ELEMENT:"+num); 
 }
} 

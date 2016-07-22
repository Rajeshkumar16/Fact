package Demo;

public class Palindromenumber {

public static void main(String[] args)
{
int num=23;

int n=num;

int sum=0;
while(num>0)
{
sum=sum+num%10;
num=num/10;
System.out.println(sum);
}
if(sum==n)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}

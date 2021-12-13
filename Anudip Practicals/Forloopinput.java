import java.util.Scanner;

class Forloopinput
{
public static void main(String arg[])
{
int i;
int n;
System.out.println("Enter the value till where u have to print");

Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for(i=1;i<=n;i++)
{
System.out.println(i);
}
 
}
}
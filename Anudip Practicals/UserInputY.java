import java.util.Scanner;

class UserInputY
{
public static void main(String arg[])
{
int i;
float f;
Double d;
String str;

System.out.println("Enter the Integer Value");
Scanner sc1=new Scanner(System.in);
i=sc1.nextInt();

System.out.println("Enter the Float Value");
Scanner sc2=new Scanner(System.in);
f=sc2.nextFloat();

System.out.println("Enter the Double value");
Scanner sc3=new Scanner(System.in);
d=sc3.nextDouble();

System.out.println("Enter the String");
Scanner sc4=new Scanner(System.in);
str=sc4.nextLine();

System.out.println("\n");

System.out.println("Integer Value=" +i);
System.out.println("Float Value=" +f);
System.out.println("Double value=" +d);
System.out.println("String =" +str);

}}
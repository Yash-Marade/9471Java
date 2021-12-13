import java.util.Scanner;
class IfElse
{
public static void main(String arg[])
{
int marks;

System.out.println("Enter the marks");
Scanner sc=new Scanner(System.in);
marks=sc.nextInt();

if(marks>=80)
{
System.out.println("Student is passed with Distingstone");
}
else if(marks>=60 && marks<=80)
{
System.out.println("Student is passed with Firstclass");
}
else if(marks>=40 && marks<=60)
{
System.out.println("Student is passed");
}
else
{
System.out.println("Student is Fail");
}
}
}
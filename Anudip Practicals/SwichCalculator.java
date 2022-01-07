import java.util.Scanner;
public class SwichCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int a = sc.nextInt();
        System.out.println("Enter Num 2");
        int b = sc.nextInt();
        System.out.println("Enter 1 for add ");
        System.out.println("Enter 2 for sub ");
        System.out.println("Enter 3 for mul ");
        System.out.println("Enter 4 for div ");
        System.out.println("Enter 5 for Modulo ");
        int x = sc.nextInt();

        switch(x) {
            case 1 : System.out.println("Additon = "+ (a+b));
            break ;
            case 2 : System.out.println("Subtraction = "+(a-b));
            break ; 
            case 3 : System.out.println("Multiplication = "+(a*b));
            break ;
            case 4 : System.out.println("Division = "+(a/b));
            break ; 
            case 5 : System.out.println("Modulo = "+(a%b));
            break;
            default : System.out.println("Invalid Option");
        }






    }
    
}

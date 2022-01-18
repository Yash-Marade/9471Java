import java.util.Scanner;
public class MathOP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 Num.: ");
		int n = s.nextInt();
		int m = s.nextInt();
		int x = s.nextInt();
		
		int a = n+m+x;
		int mult = m*n*x;
		int avg = (n+m+x)/2;
		
		System.out.println("Additon "+a);
		System.out.println("Multiplication "+mult);
		System.out.println("Average "+ avg);
		
		if(n>=m && n>=x) {
			System.out.println(n+" is the largest Number");
			} else if (m>=n && m>=x) {
				System.out.println(m+"  is the largest Number");
			}else {
				System.out.println(x+"  is the largest Number");
			}
	}

}

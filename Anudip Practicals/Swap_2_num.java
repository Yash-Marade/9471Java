import java.util.Scanner;
public class Swap_2_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int z;
		System.out.println("Enter 1st Num.: ");
		int n = s.nextInt();
		System.out.println("Enter 2st Num.: ");
		int m = s.nextInt();
		
		z = n;
		n = m;
		m = z;
		
		System.out.println("1st Num " +n);
		System.out.println("2st Num " +m);

	}

}

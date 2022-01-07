import java.util.Scanner;
public class ArrayZeroTry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Lenght.: ");
		int x = sc.nextInt();
		System.out.println("Enter Numbers.: ");
		int arr[] = new int[x];
		
		try {
			for (int i=1; i <=arr.length; i++) {
				arr[i] = sc.nextInt();
			}
		} catch (Exception e) {
			System.out.print("Array Bound Exceeded");
		}
		
	}

}

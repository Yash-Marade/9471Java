import java.time.Year;
import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Year .: ");
		int x = s.nextInt();
		
		if(((x % 4 == 0) && (x % 100 != 0)) || (x % 400 == 0)) {
			
					System.out.println("Given Year is Leap year " +x);
				
			} else {
			
			System.out.println(x+" Not a Leap year");
		}

	}

}

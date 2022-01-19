import java.util.*;
public class Array_Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> listOne = new ArrayList<>(Arrays.asList("Yash","Raj"));
		ArrayList <String> listTwo = new ArrayList<>(Arrays.asList("Vicky","Sonu"));
		
		listOne.addAll(listTwo);   //both list add
		
		System.out.println(listOne);
		
	}

}

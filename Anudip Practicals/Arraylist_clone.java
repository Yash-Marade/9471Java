import java.util.*;
public class Arraylist_clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> m_list = new ArrayList<>(Arrays.asList("Yash","Vicky"));
		System.out.println("First List"+m_list);
		// clone part
		ArrayList n_list = new ArrayList();
		n_list = (ArrayList)m_list.clone();
		
		System.out.println("Second List"+n_list);

	}

}

import java.util.*;
public class Prog05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any string: ");
		String s= sc.nextLine();
		String rev= "";
		for(int i= s.length()-1; i>=0; i--) {
			rev+= s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}

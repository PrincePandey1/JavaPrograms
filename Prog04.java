import java.text.*;
public class Prog04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<2) {
			System.err.println("You haven't yet entered 2 or more arguments");
		}
		else {
			float sum=0;
			NumberFormat nf= NumberFormat.getInstance();
			for(int i=0; i<args.length; i++) {
				sum+= Float.parseFloat(args[i]);
			}
			System.out.println(nf.format(sum));
		}
	}

}

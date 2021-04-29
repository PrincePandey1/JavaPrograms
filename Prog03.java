
public class Prog03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<2) {
			System.err.println("You haven't yet entered 2 or more arguments");
		}
		else {
			int sum=0;
			for(int i=0; i< args.length; i++) {
				sum+= Integer.parseInt(args[i]);
			}
			System.out.println(sum);
		}
	}

}

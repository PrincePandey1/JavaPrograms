import java.util.*;
public class Prog07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n=in.nextLong();
		in.close();
		int i=1;
		while(true){
			System.out.println("Input "+n);
			long r=rev(n,0);
			System.out.println("rev "+r);
			long sum=r+n;
			long sumr=rev(sum,0);
			if(sum==sumr){
				System.out.println("Sum "+sum+" is Palindrome");
				break;
			}
			else{
				System.out.println(i++ + "-Sum "+sum+" is not Palindrome");
				n=sum;
			}
		}
	}

	private static long rev(long n, long r) {
		// TODO Auto-generated method stub
		if(n==0) {
			return r;
		}else {
			r=r*10+n%10;
			return rev(n/10,r);
		}	
	}

}

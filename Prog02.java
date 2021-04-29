import java.util.*;
public class Prog02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c = sc.nextInt();
		int n = sc.nextInt();
		int count=0;
		double b =(double)c/2,a;
		do {
			a = b ;
			b = ((n-1)*a+(c/Math.pow(a,n-1)))/n;
			System.out.println("trial-"+count+" value is "+b);
			count++;
			}
		while(Math.abs(b-a)>0||count==99);
		System.out.printf("%.6f",b);
	}

}

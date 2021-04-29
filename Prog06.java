import java.text.*;
public class Prog06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(double c=0; c<=100; c++) {
			NumberFormat nf= new DecimalFormat("0.00");
			double f= c*(9.0/5.0) + 32;
			System.out.println(c+" = "+nf.format(f)+"\t");
		}
	}

}

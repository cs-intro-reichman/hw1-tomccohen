// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double amount = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		rate = rate / 100;
		double years = Double.parseDouble(args[2]);
		double fv = amount * Math.pow(1+ rate, years);
		System.out.println("After " + (int) years + " years, $" + (int) amount + " saved at " + (rate * 100) + "% will yield $" + (int) fv);
	}
}
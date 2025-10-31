// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		lim = Math.max(lim, 0);
		int num1 = (int) (Math.random() * lim);
		int num2 = (int) (Math.random() * lim);
		int num3 = (int) (Math.random() * lim);
		System.out.println(num1 + " " + num2 + " " + num3);
		int max = Math.max(num1, Math.max(num2, num3));	
		int min = Math.min(num1, Math.min(num2, num3));
		int mid = ( num1 + num2 + num3 ) - max - min;
		System.out.println(max + " " + mid + " " + min);
	}
}

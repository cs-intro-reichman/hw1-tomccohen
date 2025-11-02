// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		//System.out.println(String.format("%02d", minutes));
		if  (hours < 12){ 
			int a = hours;
			String strMin = "" + args[0].charAt(3) + args[0].charAt(4); 
			System.out.println(a + ":" + strMin + " AM");
		} 
		else
		{ 
			if (hours == 00){
				hours = 0;
				String b = "" + minutes; 
				System.out.print(hours);
				System.out.println(":" + b + " PM");
		}
			else
		{
				hours = (hours % 12);
				System.out.print(hours);
				String strMin = "" + args[0].charAt(3) + args[0].charAt(4); 
				System.out.println(":" + strMin + " PM");
		}
	}
	}
}
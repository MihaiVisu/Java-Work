public class FixedDivider{
	public static void main(String args[]){
		double numerator = Double.parseDouble(args[0]);
		double denominator = Double.parseDouble(args[1]);

		if(denominator==0)
			System.out.println("Cannot divide by zero!");
		else
			System.out.println(numerator/denominator);
	}
}
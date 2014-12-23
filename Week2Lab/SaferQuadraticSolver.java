public class SaferQuadraticSolver{
	public static void main(String args[]){
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double c=Double.parseDouble(args[2]);

		double delta = b*b-4*a*c;

		if(delta<0)
			System.out.println("Cannot solve for real x!");
		else if (a==0) {
			System.out.println("A=0. Cannot solve equation!");
		} 
		else {
			System.out.println((-b-Math.sqrt(delta))/2*a);
			System.out.println((-b+Math.sqrt(delta))/2*a);
		}
	}
}
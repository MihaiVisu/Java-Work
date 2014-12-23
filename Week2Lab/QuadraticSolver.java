public class QuadraticSolver{
	public static void main (String args[]){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		System.out.println((-b+Math.sqrt(b*b-4*a*c))/2*a);
		System.out.println((-b-Math.sqrt(b*b-4*a*c))/2*a);
	}
}
public class ImQuadraticSolver {
	public static void main(String args[]) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double delta = b*b-4*a*c;

		if (a==0)
			System.out.println(-c/b);
		else {
			if (delta >= 0) {
				System.out.println((-b-Math.sqrt(delta))/2*a);
				System.out.println((-b+Math.sqrt(delta))/2*a);
			}
			else {
				double realPart = -b/2*a;
				double imPart = Math.sqrt(-delta)/2*a;

				System.out.println(realPart+"+"+imPart+"i");
				System.out.println(realPart+"-"+imPart+"i");
			}
		}
	}
}
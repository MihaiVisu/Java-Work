
public class MeanVariance {

	public static void main(String[] args) {
		double mean;
		double[] x = new double [args.length];
		double sum=0;
		for (int i = 0; i < x.length; i++) {
			x[i]=Double.parseDouble(args[i]);
		}
		for (int i = 0; i < x.length; i++) {
			sum+=x[i];
		}
		mean = sum/(x.length);
		System.out.println(mean);
		sum=0;
		for (int i = 0; i < x.length; i++) {
			sum += (x[i]-mean)*(x[i]-mean);
		}
		double variance = sum/(x.length);
		System.out.println(variance);
	}

}

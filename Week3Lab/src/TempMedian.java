import java.util.Arrays;

public class TempMedian {

	public static void main(String[] args) {
		int[] temps = new int[args.length];
		temps[0]=Integer.parseInt(args[0]);
		for (int i = 1; i < temps.length; i++) {
			if(args[i].equals("."))
				temps[i]=temps[i-1];
			if(args[i].equals("+"))
				temps[i]=temps[i-1]+1;
			if(args[i].equals("-"))
				temps[i]=temps[i-1]-1;
		}
		Arrays.sort(temps);
		double med;
		int n = temps.length;
		if(n%2 != 0)
			med = temps[(n+1)/2];
		else
			med = (temps[n/2]+temps[n/2+1])/2;
		System.out.println(med);
		
	}

}

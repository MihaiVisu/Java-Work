public class Distance1{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);

		//method with abs
		System.out.println(Math.abs(a-b));

		//method with min-max
		System.out.println(Math.max(a,b)-Math.min(a,b));
	}
}
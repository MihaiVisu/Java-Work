public class HelloWorld{

	public static void main(String args[]){
		//Hello World Part Q1
		System.out.println("HelloWorld");

		//Personal Greeting Part Q2
		String firstName = args[0];
		String lastName = args[1];
		System.out.println(firstName+" "+lastName);

		//Adder Part Q3
		int myNumber = Integer.parseInt(args[2]);
		int myNumber2 = Integer.parseInt(args[3]);
		System.out.println(myNumber2+myNumber);
	}
}
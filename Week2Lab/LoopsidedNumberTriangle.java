public class LoopsidedNumberTriangle{
	public static void main(String args[]) {
		for(int line_num = 1; line_num <= 9; line_num++) {
			for (int charNum = 1; charNum <= line_num; charNum++ ) {
				System.out.print(line_num);
			}
			System.out.println();
		}
	}
}
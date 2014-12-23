package week5;

public class NbyN {

	public static int[][] nbyn(int n) {
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			a[i][i]=i;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[][] a = new int[10][10];
		a=nbyn(10);
		for(int i = 0; i<10; i++ ) {
			for(int j = 0; j<10; j++ )
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}

}

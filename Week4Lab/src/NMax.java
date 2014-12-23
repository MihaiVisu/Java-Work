/**
 * Created by mihaivisuian on 12/22/14.
 */
public class NMax {

    public static int max (int a, int b, int c) {
        if(a > b && a > c) return a;
        if(b > a && b > c) return b;
        return c;
    }

    public static double max (double a, double b, double c) {
        if(a > b && a > c) return a;
        if(b > a && b > c) return b;
        return c;
    }

    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        System.out.print(max(a,b,c));
    }
}

/**
 * Created by mihaivisuian on 12/22/14.
 */
public class ArrayOps {
    public static double findMax (double[] data) {
        double max = data[0];
        for (int i = 1; i < data.length; i++) {
            if(data[i]>max)
                max = data[i];
        }
        return max;
    }

    public static double[] normalise (double[] data) {
        double[] newA = new double [data.length];
        double sum = 0;
        for (int i = 0; i < data.length; i++ )
            sum+=data[i];
        for (int i = 0; i < newA.length; i++) {
            newA[i]= data[i]/sum;
        }
        return newA;
    }

    public static void normaliseInPlace (double[] data) {
        double sum=0;
        for (double x : data)
            sum += x;
        for (int i = 0; i < data.length; i++)
            data[i]/=sum;
    }

    public static double[] reverse (double[] data) {
        double[] newA = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            newA[i] = data[data.length-i-1];
        }
        return newA;
    }

    public static void reverseInPlace (double[] data) {
        for (int i = 0; i < data.length / 2; i++) {
            double aux = data[i];
            data[i] = data[data.length-i-1];
            data[data.length-i-1] = aux;
        }
    }

    public static void swap (double[] d1, double[] d2) {
        for (int i = 0; i < d1.length; i++) {
            double aux = d1[i];
            d1[i]=d2[i];
            d2[i]=aux;
        }
    }

    public static void main (String[] args) {
        double[] a = new double[5];
        for (int i = 0; i < 5; i++) {
            a[i]=StdIn.readDouble();
        }
        reverseInPlace(a);
        for (double x : a)
            System.out.print(x+" ");
    }
}

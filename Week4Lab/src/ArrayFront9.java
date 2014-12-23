/**
 * Created by mihaivisuian on 12/22/14.
 */
public class ArrayFront9 {

    public static boolean arrayFront9 (int[] nums) {
        int n;
        if ( nums.length < 4)
            n=nums.length;
        else n=4;
        for (int i = 0; i < n; i++ ) {
            if ( nums[i] == 9 )
                return true;
        }
        return false;
    }

    public static void main (String[] args) {
        int n = args.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = Integer.parseInt(args[i]);
        System.out.println(arrayFront9(nums));
    }
}

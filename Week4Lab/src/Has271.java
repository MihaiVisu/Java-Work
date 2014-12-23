/**
 * Created by mihaivisuian on 12/22/14.
 */
public class Has271 {

    public static boolean has271 (int[] nums) {
        for (int i = 2; i < nums.length; i++) {
            if(nums[i] == nums[i-1]-6 && nums[i] == nums[i-2]-1)
                return true;
        }
        return false;
    }

    public static void main (String[] args) {
        int n = args.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.print(has271(nums));
    }

}

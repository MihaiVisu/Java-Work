/**
 * Created by mihaivisuian on 12/22/14.
 */
public class NoTriples {

    public static boolean noTriples (int[] nums) {

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i]==nums[j] && nums[j]==nums[k])
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args ) {
        int n = args.length;
        int[] nums = new int [n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.print(noTriples(nums));
    }
}

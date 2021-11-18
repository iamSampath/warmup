import java.util.Arrays;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int onesCounter = 0; //  Ones counter to count the consective ones
        int maxCounter = 0; // to Caliculate the max number of consecutive ones
        int temp = 0; // to temporarily store num values

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                onesCounter = 0;
            } else {
                onesCounter++;
                maxCounter = Math.max(onesCounter, maxCounter);
            }
        }
        System.out.println(maxCounter);
    }
}

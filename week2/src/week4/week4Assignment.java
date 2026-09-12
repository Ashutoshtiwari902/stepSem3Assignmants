package week4;
import java.util.*;
public class week4Assignment {
    static int[][] threeSum(int[] nums) {

        Arrays.sort(nums);

        int[][] result = new int[100][3];
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result[count][0] = nums[i];
                    result[count][1] = nums[left];
                    result[count][2] = nums[right];

                    count++;

                    // Skip duplicates
                    while (left < right &&
                            nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right &&
                            nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        // Create final array with correct size
        int[][] answer = new int[count][3];

        for (int i = 0; i < count; i++) {
            answer[i] = result[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        int[][] result = threeSum(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    "[" + result[i][0] + ", "
                            + result[i][1] + ", "
                            + result[i][2] + "]"
            );
        }
    }
}


import java.util.HashSet;

public class LongestConsecutive {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all elements
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: Check sequences
        for (int num : set) {

            // Start only if num-1 not present
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Count sequence
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(arr)); // Output: 4
    }
}
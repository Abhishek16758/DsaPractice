import java.util.HashMap;

public class Main {
    
    public static int[] twoSum(int[] nums, int target) {
        // HashMap banaya: <Number, Uska Index>
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Kya bacha hua number Box mein hai?
            if (map.containsKey(complement)) {
                // Agar hai, toh uska index aur current index return kar do
                return new int[] { map.get(complement), i };
            }

            // Agar nahi hai, toh current number ko Box mein save kar lo
            map.put(nums[i], i);
        }

        return new int[] {}; // Agar kuch na mile
    }

    public static void main(String[] args) {
        int[] numbers = {2, 11, 7, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        if (result.length == 2) {
            System.out.println("Indices found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

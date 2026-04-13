public class Main {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0]; // Ab tak ka sabse bada sum
        int currentSum = 0;     // Jo hum calculate kar rahe hain

        for (int num : nums) {
            currentSum += num;
            
            // Agar currentSum picche se bada hokar aaya hai, toh max update karo
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
            
            // Agar sum negative ho gaya, toh uska koi fayda nahi (reset to 0)
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Sum is: " + maxSubArray(arr));
    }
}

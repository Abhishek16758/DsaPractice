public class Main {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                // Question aksar 1-based index mangta hai, isliye +1
                return new int[] {left + 1, right + 1};
            } else if (currentSum > target) {
                // Sum bada hai, toh right side se chhota karo
                right--;
            } else {
                // Sum chhota hai, toh left side se bada karo
                left++;
            }
        }

        return new int[] {-1, -1}; // Agar kuch na mile
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

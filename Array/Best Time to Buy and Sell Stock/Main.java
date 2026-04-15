public class Main {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Sabse sasta price (shuruat mein bahut bada rakhte hain)
        int maxProfit = 0;                // Ab tak ka sabse bada profit

        for (int i = 0; i < prices.length; i++) {
            // 1. Kya aaj stock pehle se sasta hai?
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // 2. Agar aaj bechein, toh kitna profit hoga?
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        // Yahan sasta price 1 hai aur bechne ka best time 6 hai. Profit = 5.
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }
}

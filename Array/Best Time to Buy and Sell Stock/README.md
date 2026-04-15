Best Time to Buy/Sell Stock (Greedy Logic)

Problem: Aapko ek array di jayegi jisme har din ka stock price hai. Aapko ek din kharidna hai aur baad mein bechna hai taaki Sabse Zyada Profit ho.
Example: [7, 1, 5, 3, 6, 4]

Logic:
Aapko bas do cheezon ka dhyan rakhna hai:

    Minimum Price: Ab tak ka sabse sasta price kab tha? (Example mein: 1)

    Max Profit: Agar main aaj bechu, toh kitna milega? (Current Price - Min Price).

Har din check karo: "Kya aaj price pehle se sasta hai?" (Update Min). Phir check karo: "Kya aaj bechne par profit badh raha hai?" (Update Max Profit).

Final Result: 5
Logic Breakdown

    The minPrice strategy: Think of this as your "Buying Day." You are constantly looking for the lowest valley in the graph. Whenever you see a price lower than your current minPrice, you "buy" (conceptually) on that day.

    The else if strategy: If today is not the cheapest day, you check: "If I bought at my lowest minPrice and sold today, would I make more money than any profit I've seen before?"

    Why it works: You only care about the difference between a price and a previous minimum. By the time the loop ends, you've checked every possible selling day against the best possible buying day that came before it.

Complexity

    Time Complexity: O(n) — You only go through the list once.

    Space Complexity: O(1) — You only use two variables (minPrice and maxProfit), regardless of how big the input array is.

A Quick Logic Note

Your use of else if is very clever here. It means if you find a new minPrice, you don't calculate profit for that day. This makes sense because buying and selling on the same day results in 0 profit anyway!

One small thing to keep in mind: if the prices were always decreasing (e.g., {7, 6, 4, 3, 1}), your maxProfit would remain 0, which is correct because you should never buy a stock if you can only sell it for a loss.

Problem: Aapko ek array di gayi hai aur ek number k. Aapko array ke andar k length ki aisi window dhoondni hai jiska Average sabse zyada ho.

Example: nums = [1, 12, -5, -6, 50, 3], k = 4
Yahan 4 numbers ki window leni hai.

    Pehli window: [1, 12, -5, -6] -> Sum = 2

    Doosri window: [12, -5, -6, 50] -> Sum = 51

    Teesri window: [-5, -6, 50, 3] -> Sum = 42

Sabse bada sum 51 hai, toh Max Average = 51 / 4 = 12.75.
Logic: Sliding Window (Hinglish)

Agar aap har baar naye siray se sum nikalenge, toh bahut time lagega. Sliding window ka matlab hai: "Puraana kachra bahar phenko, naya saaman andar lo."

    Pehle k elements ka sum nikal lo (Pehli window).

    Ab window ko ek kadam aage badhao:

        Jo element piche chhoot gaya, use sum se Minus kar do.

        Jo naya element window mein aaya, use Plus kar do.

    Har step par check karo ki kya ye naya sum ab tak ka sabse bada sum hai.

    Dry Run

nums = [1, 12, -5, -6, 50, 3], k = 4

    Initial Sum (i=0 to 3): 1 + 12 - 5 - 6 = 2. Toh maxSum = 2.

    Slide to i=4 (Number 50): * currentSum = 2 + 50 - (nums[0])

        currentSum = 2 + 50 - 1 = 51.

        maxSum update hokar 51 ho gaya.

    Slide to i=5 (Number 3): * currentSum = 51 + 3 - (nums[1])

        currentSum = 51 + 3 - 12 = 42.

        maxSum abhi bhi 51 hi rahega.

Final Answer: 51 / 4 = 12.75.
Complexity

    Time Complexity: O(n) — Humne array ko sirf ek baar scan kiya.

    Space Complexity: O(1) — Koi extra array nahi banayi.

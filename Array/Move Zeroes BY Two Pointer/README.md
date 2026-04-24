Condition: Aapko ye "In-place" karna hai, matlab koi nayi array nahi banani.

Example: [0, 1, 0, 3, 12]
Result: [1, 3, 12, 0, 0]
Logic: The Snowball/Two-Pointer Approach (Hinglish)

Isme hum do pointers rakhte hain:

    lastNonZeroFoundAt (Locker): Ye pointer track rakhta hai ki agla non-zero number kahan rakha jayega.

    cur (Explorer): Ye poori array ko scan karta hai.

Logic Simple Hai:

    Jaise hi Explorer ko koi aisa number mile jo 0 nahi hai, wo use Locker wale index par bhej deta hai.

    Locker pointer ko ek kadam aage badha dete hain.

    Jab Explorer poori array dekh leta hai, toh Locker ke aage jitni bhi jagah bachti hai, wahan hum manually 0 bhar dete hain.

    Dry Run

Array: [0, 1, 0, 3, 12]
lastNonZeroFoundAt = 0

    cur = 0: nums[0] is 0. Kuch mat karo.

    cur = 1: nums[1] is 1 (Non-zero!).

        nums[lastNonZeroFoundAt] (index 0) par 1 rakh do.

        lastNonZeroFoundAt ab 1 ho gaya.

        Array: [1, 1, 0, 3, 12]

    cur = 2: nums[2] is 0. Kuch mat karo.

    cur = 3: nums[3] is 3 (Non-zero!).

        nums[1] par 3 rakh do.

        lastNonZeroFoundAt ab 2 ho gaya.

        Array: [1, 3, 0, 3, 12]

    cur = 4: nums[4] is 12 (Non-zero!).

        nums[2] par 12 rakh do.

        lastNonZeroFoundAt ab 3 ho gaya.

        Array: [1, 3, 12, 3, 12]

Loop Khatam! Ab lastNonZeroFoundAt (index 3) se end tak 0 bhar do.
Result: [1, 3, 12, 0, 0]
Complexity

    Time Complexity: O(n) — Humne array ko scan kiya.

    Space Complexity: O(1) — Koi extra array nahi banayi.

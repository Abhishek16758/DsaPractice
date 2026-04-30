Problem: Aapko ek array di gayi hai, aapko ek nayi array return karni hai jisme har index par baaki saare numbers ka product (multiplication) ho, lekin us index wale number ko chhod kar.

    Condition: Aap Division (/) use nahi kar sakte.

    Example: nums = [1, 2, 3, 4]

        Index 0: 2 * 3 * 4 = 24

        Index 1: 1 * 3 * 4 = 12

        Index 2: 1 * 2 * 4 = 8

        Index 3: 1 * 2 * 3 = 6

        Result: [24, 12, 8, 6]

 Logic: Prefix and Suffix Products (Hinglish)

Socho agar humein index i ka answer chahiye, toh wo kya hoga?
Answer = (Uske pehle ke saare numbers ka product) * (Uske baad ke saare numbers ka product)

    Prefix Pass: Hum ek array banate hain jo har index tak ka product store kare (baayein se daayein).

    Suffix Pass: Hum usi array mein peeche se (daayein se baayein) multiply karte hue aate hain.

    Dry Run (Bina Division ke Magic)

nums = [1, 2, 3, 4]

Step 1 (Prefix Pass):

    res[0] = 1

    res[1] = res[0] * nums[0] = 1 * 1 = 1

    res[2] = res[1] * nums[1] = 1 * 2 = 2

    res[3] = res[2] * nums[2] = 2 * 3 = 6

    Array ab aisi hai: [1, 1, 2, 6] (Ye har number ke pehle ka product hai).

Step 2 (Suffix Pass - Peeche se):

    suffix = 1

    i = 3: res[3] = 6 * 1 = 6. (Suffix update: 1 * 4 = 4)

    i = 2: res[2] = 2 * 4 = 8. (Suffix update: 4 * 3 = 12)

    i = 1: res[1] = 1 * 12 = 12. (Suffix update: 12 * 2 = 24)

    i = 0: res[0] = 1 * 24 = 24.

Final Result: [24, 12, 8, 6]
 Complexity

    Time Complexity: O(n) — Do baar array traverse ki (ek baar seedha, ek baar ulta).

    Space Complexity: O(1) — Agar hum output array ko count na karein, toh humne sirf ek suffix variable use kiya.

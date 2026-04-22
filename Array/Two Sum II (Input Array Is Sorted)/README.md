Logic: The Two-Pointer Approach (Hinglish)

Socho aapke paas ek sorted array hai: [2, 7, 11, 15] aur target hai 9.

    Do Pointers rakho: Ek sabse shuru mein (Left = 0) aur ek sabse aakhri mein (Right = last index).

    Sum Check karo: Dono pointers ki values ko add karo (2 + 15 = 17).

    Decision Lo:

        Agar Sum bahut bada hai (17 > 9): Toh sum ko chhota karne ke liye Right pointer ko peeche lao (Right--).

        Agar Sum bahut chhota hai: Toh sum ko badhane ke liye Left pointer ko aage badhao (Left++).

        Agar Sum match ho gaya: Toh wahi aapka answer hai!
        Dry Run

Array: [2, 7, 11, 15], Target: 9

    Step 1: left = 0 (value 2), right = 3 (value 15).

        Sum = 2 + 15 = 17.

        17 toh 9 se bada hai! Iska matlab aakhri wala number (15) bahut bada hai, use chhodna padega.

        right-- (Ab right = 2).

    Step 2: left = 0 (value 2), right = 2 (value 11).

        Sum = 2 + 11 = 13.

        13 bhi 9 se bada hai. Phir se bada number hatao.

        right-- (Ab right = 1).

    Step 3: left = 0 (value 2), right = 1 (value 7).

        Sum = 2 + 7 = 9.

        MATCH! Target mil gaya. Indices return kar do.

📈 Complexity

    Time Complexity: O(n) — Humne sirf ek baar array ko scan kiya (dono pointers milkar poori array cover karte hain).

    Space Complexity: O(1) — Humne koi extra memory (HashMap) use nahi ki. Sirf do variables (left, right) use kiye.

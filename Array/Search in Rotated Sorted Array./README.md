Logic: The "One Side is Always Sorted" Rule

Sorted array ko jab aap rotate karte ho, toh ek bahut kamaal ki baat hoti hai: Agar aap array ko beech (mid) se todoge, toh kam se kam ek side hamesha fully sorted hogi.

Plan:

    mid dhoondo.

    Check karo: Kya Left side (low to mid) sorted hai?

        Agar Haan, toh check karo ki kya target is range mein aata hai. Agar aata hai toh wahin dhoondo, nahi toh Right side jao.

    Agar Left sorted nahi hai, toh pakka Right side (mid to high) sorted hogi.

        Check karo ki kya target is Right range mein aata hai. Agar aata hai toh wahan dhoondo, nahi toh Left side jao.
Dry Run 

Input: [4, 5, 6, 7, 0, 1, 2], Target: 0
Step 1: low = 0 (4), high = 6 (2), mid = 3 (7).

    nums[mid] is 7. Target (0) match nahi hua.

    Check: Is Left (4 to 7) sorted? Yes! (4 <= 7)

    Check: Kya 0 is range (4 to 7) mein aata hai? No!

    Toh Right side chalo: low = mid + 1 (Index 4).

Step 2: low = 4 (0), high = 6 (2), mid = 5 (1).

    nums[mid] is 1. Target (0) match nahi hua.

    Check: Is Left (0 to 1) sorted? Yes! (0 <= 1)

    Check: Kya 0 is range (0 to 1) mein aata hai? Yes!

    Toh Left side chalo: high = mid - 1 (Index 4).

Step 3: low = 4, high = 4, mid = 4.

    nums[4] is 0. MATCH! Return index 4.

    Complexity
    Time Complexity: $O(\log n)$ — Humne Binary Search hi kiya hai, bas thode extra checks ke saath.
    Space Complexity: $O(1)$ — Koi extra space nahi.
        

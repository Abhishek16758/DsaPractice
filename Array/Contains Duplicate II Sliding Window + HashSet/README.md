Problem: Aapko ek array di gayi hai aur ek number k. Aapko batana hai ki kya array mein koi do aise numbers hain jo bilkul same hon (nums[i] == nums[j]) aur unke beech ka distance k se zyada na ho (abs(i - j) <= k).

Example: nums = [1, 2, 3, 1, 2, 3], k = 2

    Yahan 1 index 0 par hai aur index 3 par. Distance = 3−0=3.

    3 > k (2), isliye ye valid nahi hai.

    Agar hum poori array check karein aur koi bhi pair k distance ke andar na mile, toh result False hoga.

Logic: Sliding Window + HashSet (Hinglish)

Socho aap ek Khidki (Window) mein se array ko dekh rahe ho jiski maximum width k hai.

    Hum ek HashSet banayenge jo window ke andar ke numbers ko yaad rakhega.

    Hum array mein aage badhenge:

        Agar naya number pehle se HashSet mein hai, iska matlab humein k distance ke andar duplicate mil gaya! (True)

        Agar nahi hai, toh use HashSet mein daal do.

    Twist: Agar hamari window k se badi hone lage, toh jo number sabse peeche reh gaya hai, use HashSet se nikaal do. Isse HashSet mein hamesha wahi numbers rahenge jo k distance ke andar hain.

    Dry Run

nums = [1, 2, 3, 1], k = 3

    i = 0: Window khali hai. window = {1}.

    i = 1: 2 window mein nahi hai. window = {1, 2}.

    i = 2: 3 window mein nahi hai. window = {1, 2, 3}.

    i = 3: 1 window mein mil gaya! (Kyunki distance 3−0=3 hai jo ≤k hai).

        Result: True.

Complexity

    Time Complexity: O(n) — Humne array ko ek baar scan kiya aur HashSet ka contains/add O(1) hota hai.

    Space Complexity: O(k) — HashSet mein hum ek waqt par maximum k elements hi rakhte hain.

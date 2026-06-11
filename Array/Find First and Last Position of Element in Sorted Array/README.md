Problem: Ek sorted array nums hai aur ek target value hai. Hamein target ka start index aur end index return karna hai. Agar target nahi mila, toh [-1, -1] return karo.

Example: nums = [5, 7, 7, 8, 8, 10], target = 8
Result: [3, 4] (kyunki 8 index 3 aur 4 par hai).
🧠 Logic: Two Binary Searches (Hinglish)

Normal Binary Search humein sirf yeh batata hai ki target kahan hai, lekin saare duplicates mein se "sabse pehla" ya "sabse aakhri" kaunsa hai, yeh hum Binary Search ko tweak karke nikalenge.

    First Position dhoondne ke liye: Jab nums[mid] == target mile, toh rukna nahi hai. Hamein Left side mein aur dhoondna hai (high = mid - 1), kyunki ho sakta hai usse pehle bhi wahi target ho.

    Last Position dhoondne ke liye: Jab nums[mid] == target mile, toh Right side mein aur dhoondna hai (low = mid + 1), taaki sabse aakhri target mil jaye.

    Dry Run (First Position ke liye)

nums = [5, 7, 7, 8, 8, 10], target = 8, isFirst = true

    low=0, high=5, mid=2 (7). 7 < 8? Yes → low = 3.

    low=3, high=5, mid=4 (8). Match! index = 4. isFirst true hai, toh high = 3.

    low=3, high=3, mid=3 (8). Match! index = 3. high = 2.

    Loop khatam. Return index = 3.

📈 Complexity

    Time Complexity: O(logn) — Kyunki humne do baar Binary Search kiya (O(logn)+O(logn)=O(logn)).

    Space Complexity: O(1).

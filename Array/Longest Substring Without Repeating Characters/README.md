Logic: Sliding Window (Hinglish Mein)

Imagine kijiye aap ek string abcabcbb ko dekh rahe hain.

    Hum ek Window banate hain jo shuruat mein 0 size ki hoti hai.
    Hum window ka right side (right) aage badhate hain aur letters ko ek HashSet (ya HashMap) mein daalte jate hain.

Twist: Agar koi letter repeat hota hai (jaise dobara 'a' aa gaya), toh hum window ka left side (left) tab tak aage badhayenge jab tak wo purana 'a' window se bahar na nikal jaye.    
Har step par hum check karte hain ki window ki lambai (right - left + 1) kitni hai, aur sabse badi lambai ko save kar lete hain.
Complexity Breakdown

    Time Complexity: O(n) — Aapko lag raha hoga loop ke andar while hai toh slow hoga, lekin left pointer bhi sirf ek hi baar puri string traverse karta hai. Isliye total kaam O(2n) hota hai jise hum O(n) kehte hain.

    Space Complexity: O(k) — Yahan k hai unique characters ka count (maximum characters jo HashSet mein jayenge).
    

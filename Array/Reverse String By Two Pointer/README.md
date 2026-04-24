Yeh Two Pointers ka sabse "shuddh" (pure) example hai. Interviewer yeh dekhna chahta hai ki kya aap bina StringBuilder.reverse() use kiye, memory ko optimize karke string ko ulta kar sakte hain.

Condition: Aapko extra memory use nahi karni (O(1) space).
Logic: The Swap Strategy (Hinglish)

Imagine kijiye 5 log ek line mein khade hain aur unhe ulta khada hona hai.

    Sabse pehle wala (Left) aur sabse aakhri wala (Right) apni jagah badal lenge (Swap).

    Phir dono ek-ek kadam beech ki taraf aayenge aur wahi repeat karenge.

    Jab dono beech mein mil jayenge, toh poori line ulti ho chuki hogi.

Java Code

Java mein String immutable hoti hai (badli nahi ja sakti), isliye interview mein aksar char[] (characters ka array) diya jata hai.

Dry Run

Input: ['h', 'e', 'l', 'l', 'o']

    Initial: left = 0 ('h'), right = 4 ('o').

        Swap 'h' and 'o' → ['o', 'e', 'l', 'l', 'h']

        left++ (1), right-- (3).

    Next Step: left = 1 ('e'), right = 3 ('l').

        Swap 'e' and 'l' → ['o', 'l', 'l', 'e', 'h']

        left++ (2), right-- (2).

    Stop: Ab left < right nahi raha (dono 2 par hain). Loop khatam.

Complexity

    Time Complexity: O(n) — Kyunki humne sirf n/2 steps liye (beech tak pahunche). Big O mein ise O(n) hi kehte hain.

    Space Complexity: O(1) — Humne sirf ek temp variable use kiya, koi naya array nahi banaya.

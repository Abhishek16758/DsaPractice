Frequency Counting (Sabse Fast)

Interview mein aapko ye method batana chahiye kyunki ye O(n) mein kaam karta hai. Hum ek Frequency Array (ya HashMap) banate hain jo letters ka hisaab rakhta hai.

Logic (Hinglish):

    Ek 26 size ka array banao (kyunki alphabet mein 26 letters hote hain). Iska naam rakhte hain counts.

    Pehli string ke har letter ke liye, uski jagah par +1 kar do.

    Doosri string ke har letter ke liye, uski jagah par -1 kar do.

    Agar aakhir mein saare box 0 hain, toh iska matlab dono strings mein barabar letters the.
    Is line ka matlab kya hai: s.charAt(i) - 'a'?

Ye thoda tricky lag sakta hai. Java mein har character ki ek ASCII value hoti hai.

    'a' ki value hai 97.

    'b' ki value hai 98.

    Agar main 'b' - 'a' karun, toh result aayega 98 - 97 = 1.
    Is tarah se humein 'b' ke liye index 1 mil jata hai, 'c' ke liye 2, aur 'a' ke liye 0.

🚀 Complexity Analysis:

    Time Complexity: O(n) — Humne sirf ek baar string ko scan kiya.

    Space Complexity: O(1) — Humne sirf 26 size ka array banaya. Chahe string kitni bhi badi ho, ye array hamesha 26 ka hi rahega.

Logic:
Isme hum Two Pointers use karte hain. Ek pointer shuruat mein (L) aur ek aakhri mein (R).

    Dono ko beech ki taraf lao.

    Har step par check karo: L wala letter aur R wala letter same hai?

    Agar same nahi hai, toh turant bolo False.

    Beech mein pahunch gaye aur sab same mila, toh True.


Is Code mein ho kya raha hai? (Step-by-Step)

    replaceAll("[^a-zA-Z0-9]", ""): String mein bahut saare faltu characters ho sakte hain jaise , : ya spaces. Ye line un sabko nikaal deti hai aur sirf "alphanumeric" characters rakhti hai.

    toLowerCase(): Kyunki 'A' aur 'a' algorithm ke liye alag hote hain, hum sabko ek jaisa kar dete hain.

    The While Loop:

        left pointer 0 se shuru hota hai.

        right pointer aakhri index se shuru hota hai.

        Har baar dono letters ko compare karte hain. Agar kahin bhi alag mile, toh seedha false.

📈 Complexity Check

    Time Complexity: O(n) — Kyunki humne string ko sirf ek baar scan kiya.

    Space Complexity: O(n) — Kyunki humne ek nayi cleanString banayi.

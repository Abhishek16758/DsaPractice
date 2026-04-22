Boyer-Moore Voting Algorithm (The Legend)

Yeh method O(n) time aur O(1) space mein kaam karta hai. Iska logic "Election" jaisa hai.

Logic (Hinglish):

    Ek candidate chun lo (shuruat mein pehla number) aur use count = 1 de do.

    Agle numbers par jao:

        Agar naya number same hai, toh count++ (usko support karo).

        Agar naya number alag hai, toh count-- (uske khilaf vote do).

        Agar count zero ho jaye, toh naya candidate chun lo.

    Kyunki majority element aadhe se zyada hai, wo hamesha end tak bacha rahega.

Dry Run

Array: [2, 2, 1, 1, 1, 2, 2]

    Start: candidate = 2, count = 1.

    Num = 2: Same hai! count = 2.

    Num = 1: Alag hai! count = 1.

    Num = 1: Alag hai! count = 0.

    Num = 1: Count zero tha, toh naya candidate = 1, count = 1.

    Num = 2: Alag hai! count = 0.

    Num = 2: Count zero tha, toh naya candidate = 2, count = 1.

Aakhir mein 2 bacha, aur wahi answer hai.

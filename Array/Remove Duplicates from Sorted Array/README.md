The Two-Pointer Approach (Hinglish)

Kyunki array Sorted hai, iska matlab saare duplicate numbers ek ke baad ek (padosi) honge. Hamein kya karna hai? Hamein "Unique" numbers ko array ke shuruat mein shift karna hai.

Imagine kijiye aapke paas do pointers hain:

    i (Slow Pointer): Yeh pointer tabhi aage badhega jab humein koi Naya (Unique) number milega. Yeh unique numbers ki "boundary" hai.

    j (Fast Pointer): Yeh poori array ko scan karega aur naye numbers dhoondega.

Process:

    Agar nums[j] aur nums[i] same hain, toh j ko aage badha do (duplicate mil gaya).

    Agar nums[j] aur nums[i] alag hain, iska matlab naya unique number mil gaya! Ab i ko ek kadam aage badhao aur wahan nums[j] ko copy kar do.
    Why is this good?

    Time Complexity: O(n) — Kyunki humne array ko sirf ek baar scan kiya.

    Space Complexity: O(1) — Humne koi nayi array ya HashSet nahi banayi, usi array mein changes kiye. Interviewers ko In-place solutions bahut pasand aate hain.

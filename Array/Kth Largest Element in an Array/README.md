
**Question: Kth Largest Element in an Array**

**Problem:** Aapko ek un-sorted array di gayi hai aur ek number `k`. Aapko array ka **$K^{th}$ sabse bada** element nikaalna hai.

* **Example:** `nums = [3, 2, 1, 5, 6, 4]`, `k = 2`
* Agar hum is array ko bade se chote order mein lagayein: `[6, 5, 4, 3, 2, 1]`
* Yahan $1^{st}$ largest `6` hai, aur $2^{nd}$ largest `5` hai. Toh answer hoga **5**.

---

 Logic: The Two Approaches (Hinglish)

#### **Method 1: Sorting (Simple but Slow)**

Array ko sort kar do (`Arrays.sort()`). Java mein sort karne ke baad array chote se bada ho jayegi: `[1, 2, 3, 4, 5, 6]`.
$K^{th}$ largest element hamesha peeche se $K^{th}$ position par hoga, yaani index `n - k` par.

* **Time Complexity:** $O(n \log n)$

#### **Method 2: Min-Heap (Smart & Fast)**

Interviewer aapko kahega: *"Mujhe $O(n \log n)$ se tez chahiye, kya aap $O(n \log k)$ mein kar sakte ho?"* tab kaam aata hai **Min-Heap**.

**Min-Heap ka simple asool:** Yeh ek aisi tijori (Data Structure) hai jisme sabse chhota number hamesha sabse **upar** rehta hai.

1. Hum ek-ek karke numbers ko Min-Heap mein daalenge.
2. Agar Min-Heap ka size `k` se **bada** hone lage, toh hum sabse chote number ko **bahar phenk** denge (`poll()`).
3. Aise karte-karte, aakhir mein tijori mein sirf **`k` sabse bade numbers** hi bachenge. Aur un sabse bade numbers mein se jo sabse chhota hoga (yaani jo sabse upar baitha hoga), wahi hamara $K^{th}$ largest element hoga!

---



---

Dry Run in a Table

Input: `[3, 2, 1, 5]`, `k = 2` (Humein $2^{nd}$ sabse bada number chahiye)

| Step | Current Number | Heap Status (Min-Heap) | Size | Condition (`Size > 2`) | Action |
| --- | --- | --- | --- | --- | --- |
| **1** | `3` | `[3]` | 1 | No | Kuch nahi |
| **2** | `2` | `[2, 3]` (2 sabse chhota hai, toh upar) | 2 | No | Kuch nahi |
| **3** | `1` | `[1, 2, 3]` (1 sabse chhota hai, toh upar) | 3 | **Yes!** (3 > 2) | Top se `1` ko delete karo $\rightarrow$ `[2, 3]` |
| **4** | `5` | `[2, 3, 5]` (2 sabse chhota hai, toh upar) | 3 | **Yes!** (3 > 2) | Top se `2` ko delete karo $\rightarrow$ `[3, 5]` |

**End:** Loop khatam ho gaya. Heap ke top (`peek()`) par kya bacha hai? **3**.
Aur aap dekh sakte hain ki `[3, 2, 1, 5]` mein $2^{nd}$ largest number sach mein `3` hi hai!

---

 Complexity

* **Time Complexity:** $O(n \log k)$ — Kyunki heap ka size kabhi bhi `k` se bada nahi hota, isliye har element ko daalne/nikalne mein sirf $\log k$ time lagta hai.
* **Space Complexity:** $O(k)$ — Heap mein ek waqt par sirf `k` elements store hote hain.

---




Sorting ka matlab hota hai data ko ek line mein lagana (chote se bada ya bade se chota). Is hafte hum teen sabse bade sorting heroes ko dekhenge:

1. **Bubble Sort** (Sabse asaan aur desi)
2. **Merge Sort** (Divide and Conquer - Interviewer ka favourite)
3. **Quick Sort** (Fastest in real world)

Chaliye, aaj sabse simple aur funny sorting algorithm se shuru karte hain: **Bubble Sort**.

---

 Bubble Sort: The "Padosi" Logic (Neighbor Rule)

Iska naam "Bubble" isliye hai kyunki jaise paani mein se halke bubbles upar aa jate hain, waise hi isme **sabse bade numbers tairte hue array ke aakhri mein** pahunch jate hain.

**Simple Logic (Hinglish):**

1. Aap array ke shuruat se chalna shuru karte ho.
2. Apne padosi (next element) ko dekho.
3. Agar aap apne padosi se **bade** ho, toh usse apni seat badal lo (**Swap**).
4. Aise hi poori array mein ghumo. Pehle round ke baad, sabse bada number sabse aakhri seat par pahunch jayega.
5. Ye round tab tak chalate raho jab tak poori array sort na ho jaye.

---


Dry Run in a Table 

Chaliye `[5, 1, 4]` ka **pehla round** dekhte hain:

| Step | j Index | `arr[j]` | `arr[j+1]` | Condition (`arr[j] > arr[j+1]`) | Action | Array Status |
| --- | --- | --- | --- | --- | --- | --- |
| **Start** | - | - | - | - | - | `[5, 1, 4]` |
| **1** | 0 | `5` | `1` | `5 > 1` (Haan!) | Swap 5 and 1 | `[1, 5, 4]` |
| **2** | 1 | `5` | `4` | `5 > 4` (Haan!) | Swap 5 and 4 | `[1, 4, 5]` |

**Round 1 Khatam!** Dekha aapne? Sabse bada number `5` khud tairta hua sabse aakhir mein pahunch gaya.

---

### 📉 Complexity Check

* **Time Complexity:** $O(n^2)$ — Kyunki loop ke andar loop chal raha hai. Yeh thoda slow hai, isliye bade data ke liye hum ise use nahi karte.
* **Space Complexity:** $O(1)$ — Koi extra array nahi chahiye.

Kya Bubble Sort ka ye padosi wala khel aur table samajh mein aaya? Agar haan, toh kal hum **Merge Sort** dekhenge jo isse bohot zyada fast hai!

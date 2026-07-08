**Problem:** Aapko ek n \times n ki 2D matrix di gayi hai. Aapko use sui ki disha mein (Clockwise) **90 degrees ghumana** hai, wo bhi bina koi extra matrix banaye (O(1) space).
 * **Input:**
   ```text
   [ 1, 2, 3 ]
   [ 4, 5, 6 ]
   [ 7, 8, 9 ]
   
   ```
 * **Output (90° rotated):**
   ```text
   [ 7, 4, 1 ]
   [ 8, 5, 2 ]
   [ 9, 6, 3 ]
   
   ```
 Logic: The 2-Step Magic (Hinglish)**
Matrix ko 90 degree ghumane ka ek bohot hi shaandar shortcut hai:
 1. **Step 1: Transpose Kar Do:** Jo humne abhi seekha—saare rows ko columns bana do.
   * [1, 2, 3] ban gaya pehla column.
   * Matrix aisi dikhegi:
     ```text
     [ 1, 4, 7 ]
     [ 2, 5, 8 ]
     [ 3, 6, 9 ]
     
     ```
 2. **Step 2: Har Row ko Ulta (Reverse) Kar Do:** Ab har ek row ko pakdo aur use reverse kar do (jaise normal array ko reverse karte hain Two Pointers se).
   * Pehli row [1, 4, 7] ban jayegi [7, 4, 1].
   * Doosri row [2, 5, 8] ban jayegi [8, 5, 2].
   * Teesri row [3, 6, 9] ban jayegi [9, 6, 3].
**Bamm! Hamari matrix 90 degree rotate ho gayi!**

Dry Run in a Table (Step 2 - Reversing Rows)**
Transpose ke baad hamari matrix thi: [[1,4,7], [2,5,8], [3,6,9]]. Chaliye dekhte hain Step 2 kaise chala:
| Row Index (i) | Initial Row | Left Pointer (left) | Right Pointer (right) | Swap Action | Final Row Status |
|---|---|---|---|---|---|
| **0** | [1, 4, 7] | 0 (value 1) | 2 (value 7) | Swap 1 and 7 | [7, 4, 1] |
| **1** | [2, 5, 8] | 0 (value 2) | 2 (value 8) | Swap 2 and 8 | [8, 5, 2] |
| **2** | [3, 6, 9] | 0 (value 3) | 2 (value 9) | Swap 3 and 9 | [9, 6, 3] |
Complexity**
 * **Time Complexity:** O(n^2) — Pehle transpose karne mein saare elements dekhe, fir reverse karne mein saare elements dekhe.
 * **Space Complexity:** O(1) — Humne koi extra matrix use nahi ki, isliye ye optimal solution hai.

 **Problem:** Aapko ek m \times n ki matrix di gayi hai. Aapko uske saare elements ko **Spiral Order** (yaani jalebi ki tarah gol-gol ghumte hue, bahar se andar ki taraf) ek single line mein print ya return karna hai.
 * **Input:**
   ```text
   [ 1,  2,  3,  4 ]
   [ 5,  6,  7,  8 ]
   [ 9, 10, 11, 12 ]
   
   ```
 * **Output:** [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
Logic: 4 Boundaries Rule (Hinglish)**
Is sawaal ko chalane ke liye hum char deewarein (boundaries) banate hain:
 1. top: Pehli row (0)
 2. bottom: Aakhri row (m-1)
 3. left: Pehla column (0)
 4. right: Aakhri column (n-1)
Hum ek loop chalayenge aur har round mein **4 directions** mein move karenge:
 1. **Left se Right** jao (top row par) \rightarrow Jab ye line khatam ho jaye, toh top++ kar do (yaani upar ki deewar ek kadam neeche khisak gayi).
 2. **Top se Bottom** jao (right col par) \rightarrow Line khatam hone par right-- kar do.
 3. **Right se Left** jao (bottom row par) \rightarrow Line khatam hone par bottom-- kar do.
 4. **Bottom se Top** jao (left col par) \rightarrow Line khatam hone par left++ kar do.
Yeh tab tak chalega jab tak left <= right aur top <= bottom rahe.

 Dry Run in a Table (Pehla Round)**
Chaliye matrix [1..12] ke liye pehla round dekhte hain jahan boundaries hain: top=0, bottom=2, left=0, right=3.
| Direction | Loop Range | Element Access | Added to Result | Boundary Updated |
|---|---|---|---|---|
| **1. L \rightarrow R** | j from 0 to 3 | matrix[0][j] | 1, 2, 3, 4 | top ban gaya **1** |
| **2. T \rightarrow B** | i from 1 to 2 | matrix[i][3] | 8, 12 | right ban gaya **2** |
| **3. R \rightarrow L** | j from 2 to 0 | matrix[2][j] | 11, 10, 9 | bottom ban gaya **1** |
| **4. B \rightarrow T** | i from 1 to 1 | matrix[i][0] | 5 | left ban gaya **1** |
Ab boundaries choti ho kar andar waale square [6, 7] par aa gayi hain, aur agle round mein wo bhi print ho jayenge.
Complexity**
 * **Time Complexity:** O(m \times n) — Kyunki hum matrix ke har ek element ko exact ek baar touch kar rahe hain.
 * **Space Complexity:** O(1) — Agar output list ko na ginein, toh humne sirf boundary variables use kiye hain.


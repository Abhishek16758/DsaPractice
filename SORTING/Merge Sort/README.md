Merge Sort: The "Divide & Rule" Logic (Batwara Rule)

Merge Sort ka ek hi asool hai: "Bade problem ko tab tak chhote tukdon mein todo, jab tak wo bilkul asaan na ho jaye."
Imagine kijiye aapke paas ek un-sorted array hai: [4, 1, 3, 2]
Divide (Todna): Array ko beech se do hisson mein tod do $\rightarrow$ [4, 1] aur [3, 2].
Aur Todo: Inhe tab tak todo jab tak single-single numbers na bach jayein $\rightarrow$ [4], [1], [3], [2]. (Ek single number hamesha pehle se sorted hota hai!).
Conquer & Merge (Jodna): Ab in chhote tukdon ko wapas jodte waqt sort karte chalo:
[4] aur [1] ko sahi se joda $\rightarrow$ [1, 4]
[3] aur [2] ko sahi se joda $\rightarrow$ [2, 3]
Ab [1, 4] aur [2, 3] ko dhyan se jodenge $\rightarrow$ [1, 2, 3, 4].
Jodne (merge) ka Dry Run in a Table

Socho hamare paas do sorted tukde hain: L = [1, 4] aur R = [2, 3]. Hum inhe ek khali array arr mein bhar rahe hain.
Hum teen pointers rakhenge: i for L, j for R, aur k for main array
Step,i (L),j (R),Compare (L[i] vs R[j]),Winner (Chhota Kaun?),Action,Array Status
Start,0 (1),0 (2),1 <= 2,1 (L wins),"arr[k] = 1, i++","[1, _, _, _]"
1,1 (4),0 (2),4 <= 2,2 (R wins),"arr[k] = 2, j++","[1, 2, _, _]"
2,1 (4),1 (3),4 <= 3,3 (R wins),"arr[k] = 3, j++","[1, 2, 3, _]"
3,1 (4),2 (End),R khatam ho gaya,4 (L bacha hai),"arr[k] = 4, i++","[1, 2, 3, 4]"
Complexity
Time Complexity: $O(n \log n)$ — Har level par todne ki cost $\log n$ hoti hai aur jodne ki cost $n$. Yeh har condition (Best, Worst, Average) mein itna hi tez chalta hai.Space Complexity: $O(n)$ — Kyunki humein jodte waqt temporary arrays (L aur R) banani padti hain.

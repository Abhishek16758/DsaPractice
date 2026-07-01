Bubble Sort: The "Padosi" Logic (Neighbor Rule)

Iska naam "Bubble" isliye hai kyunki jaise paani mein se halke bubbles upar aa jate hain, waise hi isme sabse bade numbers tairte hue array ke aakhri mein pahunch jate hain.

Simple Logic (Hinglish):

    Aap array ke shuruat se chalna shuru karte ho.

    Apne padosi (next element) ko dekho.

    Agar aap apne padosi se bade ho, toh usse apni seat badal lo (Swap).

    Aise hi poori array mein ghumo. Pehle round ke baad, sabse bada number sabse aakhri seat par pahunch jayega.

    Ye round tab tak chalate raho jab tak poori array sort na ho jaye.

    Dry Run in a Table (Aapki Favourite Style!)Chaliye [5, 1, 4] ka pehla round dekhte hain:
Start,-,-,-,-,-,"[5, 1, 4]"
1,0,5,1,5 > 1 (Haan!),Swap 5 and 1,"[1, 5, 4]"
2,1,5,4,5 > 4 (Haan!),Swap 5 and 4,"[1, 4, 5]"
Round 1 Khatam! Dekha aapne? Sabse bada number 5 khud tairta hua sabse aakhir mein pahunch gaya.📉 Complexity CheckTime Complexity: $O(n^2)$ — Kyunki loop ke andar loop chal raha hai. Yeh thoda slow hai, isliye bade data ke liye hum ise use nahi karte.Space Complexity: $O(1)$ — Koi extra array nahi chahiye.

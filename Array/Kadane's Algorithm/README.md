The "Sliding Window" Pattern

Aaj hum ek nayi technique seekhenge jise Sliding Window kehte hain. Yeh technique arrays ke bade problems ko bahut chhota kar deti hai.

Problem: Aapko ek array di gayi hai, aur aapko sabse badi "Subarray" (ek saath wale numbers) dhoondni hai jiska sum sabse zyada ho.
Example: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Isme agar hum [4, -1, 2, 1] ko dekhein, toh inka sum 6 aata hai, jo sabse bada hai.
🧠 Logic: Kadane's Algorithm (Desi Style)

Isse hum Kadane’s Algorithm kehte hain. Iska simple logic ye hai:

    Aap array mein chalna shuru karte ho.

    Har step par aap puchte ho: "Kya purana sum lekar aage badhun, ya purana kachra phenk kar naye siray se shuru karun?"

    Agar purana sum plus current number milkar aur bada ho raha hai, toh saath le lo.

    Agar purana sum negative ho chuka hai, toh use zero kar do aur naye number se shuru karo.

package com.practice;
import java.util.HashSet; // HashSet use karne ke liye import karna zaroori hai

public class HashSetPractice {
    
    // Ye function check karega ki array mein duplicate hai ya nahi
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            if (seenNumbers.contains(num)) {
                return true; // Duplicate mil gaya!
            }
            seenNumbers.add(num); // Number ko box mein daal do
        }
        return false; // Pura array check kar liya, koi duplicate nahi mila
    }

    // Yeh hai Main Method - Jahan se program start hota hai
    public static void main(String[] args) {
        
        // Example 1: Isme duplicate hai (5 do baar hai)
        int[] testArray1 = {5, 8, 2, 5};
        System.out.println("Test 1 [5, 8, 2, 5] has duplicate? " + containsDuplicate(testArray1));

        // Example 2: Isme saare numbers alag hain
        int[] testArray2 = {1, 2, 3, 4};
        System.out.println("Test 2 [1, 2, 3, 4] has duplicate? " + containsDuplicate(testArray2));
    }
}
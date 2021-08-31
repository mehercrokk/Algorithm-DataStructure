package Checkifasubarraywith0sumexistsornot;

import java.util.*;

public class Checkifasubarraywith0sumexistsornot {

    // Function to check if subarray with zero-sum is present in a given array or not
    public static Boolean hasZeroSumSubarray(int[] A)
    {
        // create an empty set to store the sum of elements of each
        // subarray `A[0…i]`, where `0 <= i < arr.length`
        Set<Integer> set = new HashSet<>();

        // insert 0 into the set to handle the case when subarray with
        // zero-sum starts from index 0
        set.add(0);

        int sum = 0;

        // traverse the given array
        for (int value: A)
        {
            // sum of elements so far
            sum += value;

            // if the sum is seen before, we have found a subarray with zero-sum
            if (set.contains(sum)) {
                return true;
            }

            // insert sum so far into the set
            set.add(sum);
        }

        // we reach here when no subarray with zero-sum exists
        return false;
    }

    public static void main (String[] args)
    {
        int[] A = { 4, -6, 3, -1, 4, 2, 7 };

        if (hasZeroSumSubarray(A)) {
            System.out.println("Subarray exists");
        }
        else {
            System.out.println("Subarray does not exist");
        }
    }
}

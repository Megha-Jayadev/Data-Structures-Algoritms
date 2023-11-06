package Intro_to_problem_solving_1.Day_6_SlidingWindow;

/*
Problem Description:
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.


Problem Constraints:
1 <= len(A) <= 103
1 <= A[i] <= 103
1 <= B <= 107

Input Format : The first argument given is the integer array A. The second argument given is an integer B.
Output Format : Return the count of good subarrays in A.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = 4
Input 2:
A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
B = 65

Example Output
Output 1: 6
Output 2: 36

Example Explanation
Explanation 1:
Even length good subarrays = {1, 2}
Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5}
Explanation 1: There are 36 good subarrays
*/

import java.util.ArrayList;
import java.util.Arrays;

public class GoodSubarrays {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3,12,11,11,11,15));
        int B = 12;
        int N = A.size();
        long ans = 0;

        //Calculate prefixSum
        for(int i=0; i<N; i++){
            long sum = 0;
            for(int j=i; j<N; j++){
                int size = j-i+1;
                sum = sum + A.get(j);
                if(size % 2 == 0 && sum < B || size % 2 != 0 && sum > B){
                    ans = ans + 1;
                }
            }
        }

        System.out.println(ans);

    }
}

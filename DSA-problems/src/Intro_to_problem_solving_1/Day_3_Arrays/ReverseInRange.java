package Intro_to_problem_solving_1.Day_3_Arrays;

/*
Problem Description
Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].

Problem Constraints:
1 <= N <= 105
1 <= A[i] <= 109
0 <= B <= C <= N - 1

Input Format : The first argument A is an array of integer. The second and third arguments are integers B and C
Output Format : Return the array A after reversing in the given range.

Example Input
Input 1:
A = [1, 2, 3, 4]
B = 2
C = 3
Input 2:
A = [2, 5, 6]
B = 0
C = 2

Example Output
Output 1: [1, 2, 4, 3]
Output 2: [6, 5, 2]

Example Explanation
Explanation 1: We reverse the subarray [3, 4].
Explanation 2: We reverse the entire array [2, 5, 6].
*/

import java.util.Arrays;

public class ReverseInRange {
    public static int[] reverse(int[] A, int B, int C){
        while(B < C){
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
        return A;
    }
    public static void main(String[] args) {
        int[] A = new int[]{2, 5, 6};
        int B = 0;
        int C = 2;
        int[] result = reverse(A, B, C);
        System.out.println(Arrays.toString(result));
    }
}

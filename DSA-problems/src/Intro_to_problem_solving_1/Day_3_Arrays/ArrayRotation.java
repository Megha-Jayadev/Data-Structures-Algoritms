package Intro_to_problem_solving_1.Day_3_Arrays;

/*
Problem Description:
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.

Problem Constraints
1 <= N <= 105
1 <= A[i] <=109
1 <= B <= 109

Input Format : The first argument given is the integer array A. The second argument given is the integer B.
Output Format : Return the array A after rotating it B times to the right

Example Input
Input 1:
A = [1, 2, 3, 4]
B = 2
Input 2:
A = [2, 5, 6]
B = 1

Example Output
Output 1: [3, 4, 1, 2]
Output 2: [6, 2, 5]


Example Explanation
Explanation 1: Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
Explanation 2: Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5]
*/

import java.util.Arrays;

public class ArrayRotation {
    private static int[] reverse(int[] A, int B, int C){
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
        int[] A = new int[]{1, 2, 3, 4};
        int B = 2;
        int N = A.length;
        B = B % N;
        reverse(A, 0, N-1);
        reverse(A, 0, B-1);
        reverse(A, B, N-1);
        System.out.println(Arrays.toString(A));
    }
}

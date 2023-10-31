package Intro_to_problem_solving_1.Day_3_Arrays;
/*
Problem Description:
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.

Problem Constraints:
1 <= N <= 105
-109 <= A[i] <= 109

Input Format : First argument A is an integer array.
Output Format : Return the sum of maximum and minimum element of the array

Example Input
Input 1: A = [-2, 1, -4, 5, 3]
Input 2: A = [1, 3, 4, 1]

Example Output
Output 1: 1
Output 2: 5

Example Explanation
Explanation 1: Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
Explanation 2: Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.
*/

public class MaxMinOfArray {
    public static void main(String[] args) {
        int[] A = new int[]{-2, 1, -4, 5, 3};
        int minValue = 0;
        int maxValue = 0;
        if(A.length == 0){
            System.out.println(0);
        }
        for(int i=0; i<A.length; i++){
            if(A[i] < minValue || minValue == 0){
                minValue = A[i];
            }
            if(A[i] > maxValue || maxValue == 0){
                maxValue = A[i];
            }
        }
        System.out.println(maxValue + minValue);
    }
}

package Intro_to_problem_solving_1.Day_4_PrefixSum;

/*
Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

Problem Constraints:
1 <= N <= 105
-105 <= A[i] <= 105
Sum of all elements of A <= 109

Input Format : First argument contains an array A of integers of size N
Output Format : Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

Example Input
Input 1: A = [2, 1, 6, 4]
Input 2: A = [1, 1, 1]

Example Output
Output 1: 1
Output 2: 3

Example Explanation
Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
Therefore, the required output is 1.

Explanation 2:
Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Therefore, the required output is 3.
*/

public class SpecialIndex {
    public static int[] even(int[] A){
        int[] pse = A.clone();
        for(int i=1; i<pse.length; i++){
            if(i%2 == 1){
                pse[i] = pse[i-1];
            }else{
                pse[i] = pse[i-1] + pse[i];
            }
        }
        return pse;
    }
    public static int[] odd(int[] A){
        int[] pso = A.clone();
        pso[0] = 0;
        for(int i=1; i<pso.length; i++){
            if(i%2 == 0){
                pso[i] = pso[i-1];
            }else{
                pso[i] = pso[i-1] + pso[i];
            }
        }
        return pso;
    }
    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 6, 4};
        int[] pse = even(A);
        int[] pso = odd(A);
        int count = 0;
        for(int i=0; i<A.length; i++){
            int se = pso[A.length -1] - pso[i];
            if(i!=0){
                se += pse[i-1];
            }
            int so = pse[A.length - 1] - pse[i];
            if(i!=0){
                so += pso[i-1];
            }
            if(se == so){
                count++;
            }
        }
        System.out.println(count);
    }
}

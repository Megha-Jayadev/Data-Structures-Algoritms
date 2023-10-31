package Intro_to_problem_solving_1.Day_6_SlidingWindow;

/*
Problem Description:
Given an array A of length N. Also given are integers B and C.
Return 1 if there exists a subarray with length B having sum C and 0 otherwise

Problem Constraints:
1 <= N <= 105
1 <= A[i] <= 104
1 <= B <= N
1 <= C <= 109

Input Format : First argument A is an array of integers. The remaining arguments B and C are integers
Output Format : Return 1 if such a subarray exist and 0 otherwise

Example Input
Input 1:
A = [4, 3, 2, 6, 1]
B = 3
C = 11
Input 2:
A = [4, 2, 2, 5, 1]
B = 4
C = 6

Example Output
Output 1: 1
Output 2: 0

Example Explanation
Explanation 1: The subarray [3, 2, 6] is of length 3 and sum 11.
Explanation 2: There are no such subarray
 */


import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithGivenSumAndLength {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(6));
        int B = 1;
        int C = 6;
        long sum = 0;
        int ans = 0;
        if(A.size()==B){
            sum = A.get(0);
            if(sum == C){
                ans = 1;
            }
        }
        //creating a window size
        for(int i=0; i<B;i++){
            sum += A.get(i);
        }

        int si=1; int ei=B;
        while(ei<A.size()){
            sum = sum + A.get(ei) - A.get(si-1);
            if(sum == C){
                ans = 1;
                break;
            }
            si++;
            ei++;
        }
        System.out.println(ans);
    }
}

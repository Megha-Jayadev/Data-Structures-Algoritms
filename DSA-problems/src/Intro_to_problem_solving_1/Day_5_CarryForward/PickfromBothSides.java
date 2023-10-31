package Intro_to_problem_solving_1.Day_5_CarryForward;

/*
Problem Description:
You are given an integer array A of size N.
You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
Find and return the maximum possible sum of the B elements that were removed after the B operations.
NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.

Problem Constraints:
1 <= N <= 105
1 <= B <= N
-103 <= A[i] <= 103

Input Format
First argument is an integer array A.
Second argument is an integer B.

Output Format
Return an integer denoting the maximum possible sum of elements you removed.

Example Input
Input 1:
A = [5, -2, 3 , 1, 2]
B = 3

Input 2:
A = [ 2, 3, -1, 4, 2, 1 ]
B = 4

Example Output
Output 1: 8
Output 2: 9

Example Explanation
Explanation 1: Remove element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
Explanation 2: Remove the first element and the last 3 elements. So we get 2 + 4 + 2 + 1 = 9
*/

import java.util.ArrayList;
import java.util.Arrays;

public class PickfromBothSides {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5, -2, 3 , 1, 2));
        int B = 3;
        int n = A.size();
//        long[] pSum = new long[A.size()];
//        long[] sSum = new long[A.size()];
//        long sum = 0;
//        int ans = -1;
//        if(A.size() > 0){
//            pSum[0] = A.get(0);
//            sSum[A.size()-1] = A.get(A.size()-1);
//        }
//        for(int i=1; i<A.size(); i++){
//            pSum[i] = pSum[i-1] + A.get(i);
//        }
//        for(int i=A.size()-2; i>0;i--){
//            sSum[i] = sSum[i+1] + A.get(i);
//        }
//
//        ans = (int) Math.max(pSum[B-1], sSum[A.size()-B-1]);
//        for(int i=1; i<B; i++ ){
//            sum = pSum[i-1] + sSum[A.size()-(B-i)];
//            ans = (int) Math.max(ans, sum);
//        }
//        System.out.println(ans);
//---------------------------------------------------------------------------
//        int n = A.size();
//        long []suff = new long[n + 1];
//        suff[n] = 0;
//        suff[n - 1] = A.get(n - 1);
//        for(int i = n - 2; i >= 0; i--){
//            suff[i] = A.get(i) + suff[i + 1];
//        }
//        int pref_sum = 0;
//        long ans = suff[n - B];
//        for(int i = 0; i < B; i++){
//            pref_sum = pref_sum + A.get(i) ;
//            long suff_sum = suff[n - B + (i + 1)];
//            ans = Math.max(ans, pref_sum + suff_sum);
//        }
//       System.out.println((int) ans);
//        -----------------------------------------------------------
        int curSum = 0;
        for(int i=0;i<B;i++){
            curSum = curSum + A.get(i);
        }
        int max = curSum;
        int pSum = B-1;
        int sSum = A.size() -1;

        while(pSum >= 0){
            curSum -= A.get(pSum);
            curSum += A.get(sSum);
            pSum--;
            sSum--;
            if(curSum > max){
                max = curSum;
            }
        }
        System.out.println(max);
    }
}

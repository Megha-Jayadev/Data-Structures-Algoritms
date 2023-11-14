package Intro_to_problem_solving_1.Day_5_CarryForward;

/*
Problem Description
Given an array A of length N, return the subarray from B to C.

Problem Constraints:
1 <= N <= 105
1 <= A[i] <= 109
0 <= B <= C < N

Input Format: The first argument A is an array of integers. The remaining argument B and C are integers.
Output Format : Return a subarray

Example Input
Input 1: A = [4, 3, 2, 6], B = 1, C = 3
Input 2: A = [4, 2, 2], B = 0, C = 1

Example Output
Output 1: [3, 2, 6]
Output 2: [4, 2]

Example Explanation
Explanation 1: The subarray of A from 1 to 3 is [3, 2, 6].
Explanation 2: The subarray of A from 0 to 1 is [4, 2].
*/

import java.util.Arrays;

//public class SubarrayInGivenRange {
//    public static void main(String[] args) {
//        int[] A = new int[]{4, 3, 2, 6};
//        int B = 1;
//        int C = 3;
//        int[] ans = new int[C-B+1];
//        int count = 0;
//        for(int i = B; i<= C; i++){
//            ans[count] = A[i];
//            count++;
//        }
//        System.out.println(Arrays.toString(ans));
//    }
//}



//Print All Subarrays
public class SubarrayInGivenRange {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4};

        for(int si=0; si<A.length; si++) {
            //require si & ei
            for (int ei = si; ei < A.length; ei++) {
                //print start idx to end idx
                for (int j = si; j <= ei; j++) {
                    System.out.print(A[j]);
                }
                System.out.println("");
            }
        }
    }
}


//public class SubarrayInGivenRange {
//    public static void main(String[] args) {
//        int[] A = new int[]{4, 3, 2, 6};
//        int B = 1;
//        int C = 3;
//
//        for(int i=B; i<=C; i++){
//           System.out.print(A[i]);
//        }
//    }
//}

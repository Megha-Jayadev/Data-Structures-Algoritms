package Intro_to_problem_solving_1.Day_6_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

/*
Problem Description:
Given an array A of size N, find the subarray of size B with the least average.

Problem Constraints:
1 <= B <= N <= 105
-105 <= A[i] <= 105

Input Format : First argument contains an array A of integers of size N. Second argument contains integer B.
Output Format : Return the index of the first element of the subarray of size B that has least average.
Array indexing starts from 0.

Example Input
Input 1:
A = [3, 7, 90, 20, 10, 50, 40]
B = 3
Input 2:
A = [3, 7, 5, 20, -10, 0, 12]
B = 2

Example Output
Output 1: 3
Output 2: 4


Example Explanation
Explanation 1:
Subarray between indexes 3 and 5
The subarray {20, 10, 50} has the least average
among all subarrays of size 3.
Explanation 2:
Subarray between [4, 5] has minimum average
*/

public class SubarrayWithLeastAvg {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 7, 90, 20, 10, 50, 40));
        int B = 3;
        int idx = 0;
        int si = 0;
        int count = 0;
        double sum = 0;
        double leastAvg = Integer.MAX_VALUE;

        int n = A.size();

        for (int i = 0; i < n; i++) {
            count++;
            sum = sum + A.get(i);
            if(count == B){
                double average = sum/B;
                if(average < leastAvg){
                    idx = si;
                    leastAvg = average;
                }
                sum = sum - A.get(si);
                count--;
                si++;
            }
        }

        System.out.println(idx);
    }
}

package Intro_to_problem_solving_2.Day_7_Arrays_2D_Matrices.code;

/*
Problem Description:
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.

Problem Constraints:
1 <= A.size() <= 103
1 <= A[i].size() <= 103
1 <= A[i][j] <= 103

Input Format : First argument is a 2D array of integers.(2D matrix).
Output Format : Return an array containing column-wise sums of original matrix.

Example Input
Input 1:
[1,2,3,4]
[5,6,7,8]
[9,2,3,4]

Example Output
Output 1: {15,10,13,16}

Example Explanation
Explanation 1
Column 1 = 1+5+9 = 15
Column 2 = 2+6+2 = 10
Column 3 = 3+7+3 = 13
Column 4 = 4+8+4 = 16
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ColumnSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0, new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        A.add(1, new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
        A.add(2, new ArrayList<Integer>(Arrays.asList(9,2,3,4)));

        ArrayList<Integer> res = new ArrayList<>();
        for(int col=0; col<A.get(0).size(); col++){
            long sum =0;
            for(int row =0; row<A.size();row++){
                sum += A.get(row).get(col);
            }
            res.add(Integer.valueOf((int) sum));
        }
        System.out.println(res);
    }
}

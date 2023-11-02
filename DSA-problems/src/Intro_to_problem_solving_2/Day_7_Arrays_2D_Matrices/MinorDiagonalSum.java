package Intro_to_problem_solving_2.Day_7_Arrays_2D_Matrices.code;

/*
Problem Description
You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).

Problem Constraints:
1 <= N <= 103
-1000 <= A[i][j] <= 1000

Input Format : First and only argument is a 2D integer matrix A.
Output Format : Return an integer denoting the sum of minor diagonal elements.

Example Input:
Input 1:
A = [[1, -2, -3],
[-4, 5, -6],
[-7, -8, 9]]

Input 2:
A = [[3, 2],[2, 3]]

Example Output
Output 1: -5
Output 2: 4

Example Explanation
Explanation 1: A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
Explanation 2: A[1][2] + A[2][1] = 2 + 2 = 4
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinorDiagonalSum {

    public static void main(String[] args) {
        List<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0, new ArrayList<>(Arrays.asList(1, -2, -3)));
        A.add(1, new ArrayList<>(Arrays.asList(-4, 5, -6)));
        A.add(2, new ArrayList<>(Arrays.asList(-7, -8, 9)));

        long sum = 0; int row=0; int col=A.get(0).size()-1;

        while(row<A.size() && col>=0){
            sum += A.get(row).get(col);
            row++;
            col--;
        }
        System.out.println(sum);

    }
}

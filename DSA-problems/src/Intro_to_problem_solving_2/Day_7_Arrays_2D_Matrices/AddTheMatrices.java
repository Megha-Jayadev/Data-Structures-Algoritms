package Intro_to_problem_solving_2.Day_7_Arrays_2D_Matrices.code;

/*
Problem Description:
You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.

Problem Constraints:
1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000

Input Format : The first argument is the 2D integer array A The second argument is the 2D integer array B
Output Format : You have to return a vector of vector of integers after doing required operations.

Example Input
Input 1:
A = [[1, 2, 3],
[4, 5, 6],
[7, 8, 9]]

B = [[9, 8, 7],
[6, 5, 4],
[3, 2, 1]]

Input 2:
A = [[1, 2, 3],
[4, 1, 2],
[7, 8, 9]]

B = [[9, 9, 7],
[1, 2, 4],
[4, 6, 3]]

Example Output
Output 1:
[[10, 10, 10],
[10, 10, 10],
[10, 10, 10]]

Output 2:
[[10, 11, 10],
[5,   3,  6],
[11, 14, 12]]
Example Explanation

Explanation 1:
A + B = [[1+9, 2+8, 3+7],
        [4+6, 5+5, 6+4],
        [7+3, 8+2, 9+1]]
        =
        [[10, 10, 10],
        [10, 10, 10],
        [10, 10, 10]].
Explanation 2:
A + B = [[1+9, 2+9, 3+7],
        [4+1, 1+2, 2+4],
        [7+4, 8+6, 9+3]]
        =
        [[10, 11, 10],
        [5,   3,  6],
        [11, 14, 12]].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTheMatrices {
    public static void main(String[] args) {
        List<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0, new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(1, new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(2, new ArrayList<>(Arrays.asList(7, 8, 9)));

        List<ArrayList<Integer>> B = new ArrayList<>();
        B.add(0, new ArrayList<>(Arrays.asList(9, 8, 7)));
        B.add(1, new ArrayList<>(Arrays.asList(6, 5, 4)));
        B.add(2, new ArrayList<>(Arrays.asList(3, 2, 1)));

        List<ArrayList<Integer>> res = new ArrayList<>();

        for(int row=0; row<A.size(); row++){
            ArrayList subArray = new ArrayList();
            for(int col=0; col<A.get(0).size(); col++){
                subArray.add(A.get(row).get(col) + B.get(row).get(col));
            }
            res.add(subArray);
        }
        System.out.println(res);

    }
}

package Intro_to_problem_solving_2.Day_7_Arrays_2D_Matrices.code;

/*
Problem Description:
Given a 2D integer array A, return the transpose of A.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Problem Constraints:
1 <= A.size() <= 1000
1 <= A[i].size() <= 1000
1 <= A[i][j] <= 1000

Input Format : First argument is a 2D matrix of integers.
Output Format : You have to return the Transpose of this 2D matrix.

Example Input
Input 1: A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
Input 2: A = [[1, 2],[1, 2],[1, 2]]

Example Output
Output 1: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
Output 2: [[1, 1, 1], [2, 2, 2]]

Example Explanation
Explanation 1: Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
Explanation 2: After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]]
*/

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

//        A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
//        A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));

        /*
        For square matrix below is the solution:

        for(int row=0; row<A.size(); row++ ){
            for(int col = row+1; col < A.get(0).size(); col++){
                if(row != col){
                    int temp = A.get(row).get(col);
                    A.get(row).set(col, A.get(col).get(row));
                    A.get(col).set(row, temp);
                }
            }
        }
        System.out.println(A);
        */

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int j=0; j<A.get(0).size(); j++){
            int row=0; int col = j;
            ArrayList subArray = new ArrayList();
            while(row<A.size()){
                subArray.add(A.get(row).get(col));
                row++;
            }
            res.add(subArray);
        }
        System.out.println(res);
    }
}
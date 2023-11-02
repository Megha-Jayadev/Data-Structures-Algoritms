package Intro_to_problem_solving_2.Day_7_Arrays_2D_Matrices.code;

/*
Problem Description:
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

Problem Constraints
1<= N <= 1000
1<= A[i][j] <= 1e9

Input Format: Only argument is a 2D array A of size N * N.
Output Format:
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.

Example Input
Input 1:
1 2 3
4 5 6
7 8 9

Input 2:
1 2
3 4

Example Output:
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0

Output 2:
1 0
2 3
4 0

Example Explanation
For input 1:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].

For input 2:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].
 */

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonals {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0, new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(1, new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(2, new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            int row=0; int col = i;
            ArrayList<Integer> subArray = new ArrayList<>();
            while(row<A.size()){
                if(col >=0){
                    subArray.add(row, A.get(row).get(col));
                }else{
                    subArray.add(row,0);
                }
                row++;
                col--;
            }
            res.add(subArray);
        }
        System.out.println(A.get(0).size());
        System.out.println(A.size());

        for(int i=1; i<A.get(0).size(); i++){
            int row=i; int col = A.size()-1;
            ArrayList<Integer> subArray = new ArrayList<>();
            while(col >= 0){
                if(row >= A.size()){
                    subArray.add(0);
                }else{
                    subArray.add(A.get(row).get(col));
                }
                row++;
                col--;
            }
            res.add(subArray);
        }

        System.out.println(res);
    }
}

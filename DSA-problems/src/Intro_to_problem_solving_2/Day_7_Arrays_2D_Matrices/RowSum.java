package Intro_to_problem_solving_2.Day_7_Arrays_2D_Matrices.code;

/*
Problem Constraints:
1 <= A.size() <= 103
1 <= A[i].size() <= 103
1 <= A[i][j] <= 103

Input Format : First argument A is a 2D array of integers.(2D matrix).
Output Format : Return an array containing row-wise sums of original matrix.

Example Input
Input 1:
[1,2,3,4]
[5,6,7,8]
[9,2,3,4]

Example Output
Output 1: [10,26,18]

Example Explanation
Explanation 1
Row 1 = 1+2+3+4 = 10
Row 2 = 5+6+7+8 = 26
Row 3 = 9+2+3+4 = 18
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RowSum {
    public static void main(String[] args) {
        List<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0, new ArrayList<>(Arrays.asList(1,2,3,4)));
        A.add(1, new ArrayList<>(Arrays.asList(5,6,7,8)));
        A.add(2, new ArrayList<>(Arrays.asList(9,2,3,4)));

        ArrayList<Integer> res = new ArrayList();

        for(int i=0; i<A.size(); i++){
            long sum = 0;
            for(int j=0; j<A.get(0).size(); j++){
                sum += A.get(i).get(j);
            }
            res.add((int) sum);
        }
        System.out.println(res);

    }
}

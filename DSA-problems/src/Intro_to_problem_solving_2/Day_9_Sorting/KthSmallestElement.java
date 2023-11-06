package Intro_to_problem_solving_2.Day_9_Sorting;

/*
Problem Description:
Find the Bth smallest element in given array A .
NOTE: Users should try to solve it in less than equal to B swaps.

Problem Constraints:
1 <= |A| <= 100000
1 <= B <= min(|A|, 500)
1 <= A[i] <= 109

Input Format : The first argument is an integer array A. The second argument is integer B.
Output Format : Return the Bth smallest element in given array.

Example Input
Input 1: A = [2, 1, 4, 3, 2], B = 3
Input 2: A = [1, 2], B = 2

Example Output
Output 1: 2
Output 2: 2

Example Explanation
Explanation 1: 3rd element after sorting is 2.
Explanation 2: 2nd element after sorting is 2.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthSmallestElement {
    public static void main(String[] args) {
        final List<Integer> A = new ArrayList<>(Arrays.asList(0));
        int B = 9;

        //inbuilt method also works
        //Collections.sort(A);

        //Selection sort - due to B swaps constraint
        if(A.size() > B){
            for(int i=0; i<B; i++){
                int min_idx = i;
                for(int j=i+1; j<A.size(); j++){
                    if(A.get(j) < A.get(min_idx)){
                        min_idx = j;
                    }
                }
                int temp = A.get(i);
                A.set(i, A.get(min_idx));
                A.set(min_idx, temp);
            }
            System.out.println(A.get(B-1));
        }

    }
}

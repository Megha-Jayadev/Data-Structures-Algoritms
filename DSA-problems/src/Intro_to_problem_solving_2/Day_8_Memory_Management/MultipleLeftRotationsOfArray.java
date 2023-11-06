package Intro_to_problem_solving_2.Day_8_Memory_Management;

/*
Problem Description:
Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.
Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.

Problem Constraints
1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000

Input Format : The first argument given is the integer array A. The second argument given is the integer array B.
Output Format : Return the resultant matrix.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [2, 3]

Input 2:
A = [5, 17, 100, 11]
B = [1]

Example Output
Output 1:
[ [3, 4, 5, 1, 2]
[4, 5, 1, 2, 3] ]

Output 2: [ [17, 100, 11, 5] ]

Example Explanation
for input 1 -> B[0] = 2 which requires 2 times left rotations
1: [2, 3, 4, 5, 1]
2: [3, 4, 5, 1, 2]

B[1] = 3 which requires 3 times left rotation
1: [2, 3, 4, 5, 1]
2: [3, 4, 5, 1, 2]
2: [4, 5, 1, 2, 4]
*/

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleLeftRotationsOfArray {

    public static void reverse(ArrayList a, int left, int right){
        while(left < right){
            int temp = (int) a.get(left);
            a.set(left, a.get(right));
            a.set(right, temp);
            left++;
            right--;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i=0; i<B.size(); i++){
            B.set(i, B.get(i) % A.size());
            ArrayList<Integer> subArray = new ArrayList<>(A);
            reverse(subArray, 0, subArray.size()-1);
            reverse(subArray, 0, (subArray.size()-1) - B.get(i));
            reverse(subArray, ((subArray.size()-1) - B.get(i))+1, subArray.size()-1);

            res.add(subArray);
        }
        System.out.println(res);

    }
}

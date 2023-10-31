package Intro_to_problem_solving_1.Day_3_Arrays;

/*
Problem Description:
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.

Problem Constraints:
1 <= |A| <= 105
0 <= A[i] <= 109

Input Format : The first argument is an integer array A.
Output Format : Return the second largest element. If no such element exist then return -1.

Example Input
Input 1: A = [2, 1, 2]
Input 2: A = [2]

Example Output
Output 1: 1
Output 2: -1

Example Explanation
Explanation 1: First largest element = 2. Second largest element = 1
Explanation 2: There is no second largest element in the array.
*/

public class SecondLargest {
    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 2};
        int index = 0;
        int secondLargestEle = -1;
        if(A.length==1 || A.length==0){
            System.out.println(-1);
        }
        for(int i=0; i<A.length; i++){
            if(A[i] > A[index]){
                index = i;
            }
        }
        for(int i=0; i<A.length; i++){
            if( i!= index && A[i]!=A[index]){
                secondLargestEle = Math.max(secondLargestEle, A[i]);
            }
        }
        System.out.println(secondLargestEle);
    }
}

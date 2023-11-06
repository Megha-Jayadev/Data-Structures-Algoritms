package Intro_to_problem_solving_1.Day_6_SlidingWindow;

/*
Problem Description
Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
Note: It is possible to swap any two elements, not necessarily consecutive.

Problem Constraints:
1 <= length of the array <= 100000
-109 <= A[i], B <= 109

Input Format : The first argument given is the integer array A. The second argument given is the integer B.
Output Format : Return the minimum number of swaps.

Example Input
Input 1:
A = [1, 12, 10, 3, 14, 10, 5]
B = 8
Input 2:
A = [5, 17, 100, 11]
B = 20

Example Output
Output 1: 2
Output 2: 1


Example Explanation
Explanation 1:
A = [1, 12, 10, 3, 14, 10, 5]
After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
Now, all elements less than or equal to 8 are together.
Explanation 2:
A = [5, 17, 100, 11]
After swapping 100 and 11, A => [5, 17, 11, 100].
Now, all elements less than or equal to 20 are together.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSwaps {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5, 17, 100, 11));
        int B = 20;
//        int N = A.size();
//
//        int count = 0;
//        for(int x=0; x<A.size();x++){
//            if(x <= B){
//                count++;
//            }
//        }
//        if(count <= 1){
//            System.out.println(0);
//        }else{
//            int l=0; int r=0; int x = 0;
//            while(r<count){
//                if(A.get(r) > B){
//                    x++;
//                }
//                r++;
//            }
//            int ans = x;
//            while(r<N){
//                if(A.get(r) > B){
//                    x++;
//                }
//                if(A.get(l) > B){
//                    x--;
//                }
//                ans = Math.min(ans, x);
//                r--;
//                l++;
//            }
//            System.out.println(ans);
//        }

        int n = A.size();

        int goodVal = 0;
        // Count good values in the entire array
        for (int i = 0; i < n; i++) {
            if (A.get(i) <= B) {
                goodVal++;
            }
        }

        int badVal = 0;
        //Count bad values in the current window(Window size is the goodValues size) in the given array
        for (int i = 0; i < goodVal; i++) {
            if (A.get(i) > B) {
                badVal++;
            }
        }

        int i = 0; //Start index of the window
        int j = goodVal; // End index of the window (Window size)
        int noOfSwap = badVal; // Initialise minSwaps with the badValues

        while(j < n) { //Start iterating taking the first window to the end of array
            if (A.get(i) > B) { //Decrement badValues if found in the begining of the window
                badVal--;
            }
            if (A.get(j) > B) { //Increment badValues if found at the end of the window
                badVal++;
            }
            i++;
            j++;
            noOfSwap = Math.min(badVal, noOfSwap); //Take the minimum of badValues and minimum swaps required and thats the answer.
        }

        System.out.println(noOfSwap);
    }
}


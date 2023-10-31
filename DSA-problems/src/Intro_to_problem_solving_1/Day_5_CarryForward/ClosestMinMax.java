package Intro_to_problem_solving_1.Day_5_CarryForward;

/*
Problem Description :
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
and at least one occurrence of the minimum value of the array.

Problem Constraints : 1 <= |A| <= 2000

Input Format : First and only argument is vector A
Output Format : Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array

Example Input
Input 1: A = [1, 3, 2]
Input 2: A = [2, 6, 1, 6, 9]

Example Output
Output 1: 2
Output 2: 3

Example Explanation
Explanation 1: Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
Explanation 2: Take the last 3 elements of the array.

Hint: CarryForward Technique
*/

public class ClosestMinMax {

    public static int minValue(int[] A){
        int min = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            if(A[i] < min || min == Integer.MIN_VALUE){
                min = A[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] A){
        int max = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++){
            if(A[i] > max || max == Integer.MAX_VALUE){
                max = A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 6, 4, 6, 5,1,5,2,6,4,4,2,1,5};
        if(A.length == 0){
            System.out.println(-1);
        }
        int omax = maxValue(A);
        int omin = minValue(A);
        int res = A.length;
        int imin = -1;
        int imax = -1;

        for(int i=0; i<A.length;i++){
            if(A[i] == omax){
                imax = i;
                if(imin != -1){
                    res = Math.min(res, imax - imin + 1);
                }
            }
            if(A[i] == omin){
                imin = i;
                if(imax != -1){
                    res = Math.min(res, imin - imax +1);
                }
            }
        }
        System.out.println("Max: " + omax + "----" + "Min: " + omin);
        System.out.println(res);
    }
}


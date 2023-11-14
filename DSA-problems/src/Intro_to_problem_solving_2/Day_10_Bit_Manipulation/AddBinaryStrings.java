package Intro_to_problem_solving_2.Day_10_Bit_Manipulation;

/*
Problem Description
Given two binary strings A and B. Return their sum (also a binary string).

Problem Constraints:
1 <= length of A <= 105
1 <= length of B <= 105
A and B are binary strings

Input Format : The two argument A and B are binary strings.
Output Format : Return a binary string denoting the sum of A and B

Example Input
Input 1: A = "100", B = "11"
Input 2: A = "110", B = "10"

Example Output
Output 1: "111"
Output 2: "1000"

Example Explanation
For Input 1: The sum of 100 and 11 is 111.
For Input 2: The sum of 110 and 10 is 1000.
 */

import java.math.BigInteger;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String A = "1010110111001101101000";
        String B = "1000011011000000111100110";
//        int carry = 0;
//        StringBuilder result = new StringBuilder();
//        int i = A.length() - 1;
//        int j = B.length() - 1;
//
//        while (i >= 0 || j >= 0 || carry > 0) {
//            int ld1 = (i >= 0) ? A.charAt(i) - '0' : 0;
//            int ld2 = (j >= 0) ? B.charAt(j) - '0' : 0;
//
//            int sum = ld1 + ld2 + carry;
//            result.insert(0, sum % 2);
//            carry = sum / 2;
//
//            i--;
//            j--;
//        }
        System.out.println(A.charAt(0) - '0');
        int x = 'a';
        System.out.println(x);
    }
}

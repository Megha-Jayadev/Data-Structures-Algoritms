package Intro_to_problem_solving_2.Day_11_Strings;

/*
Problem Description:
You are given a function isalpha() consisting of a character array A.
Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.

Problem Constraints
1 <= |A| <= 105

Input Format : Only argument is a character array A.
Output Format : Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.

Example Input
Input 1: A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
Input 2: A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']

Example Output
Output 1: 1
Output 2: 0

Example Explanation
Explanation 1: All the characters are alphanumeric.
Explanation 2: All the characters are NOT alphabets i.e ('#').
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Isalnum {
    public static void main(String[] args) {
        ArrayList<Character> A = new ArrayList<>(Arrays.asList('S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'));
        int res = 0;
        for(int i=0; i<A.size();i++){
            if((A.get(i)>=65 && A.get(i)<=90) || (A.get(i)>=97 && A.get(i)<=122) || (A.get(i)>=48 && A.get(i)<=57)){
                res = 1;
            }else{
                res =0;
                break;
            }
        }
        System.out.println(res);
    }
}

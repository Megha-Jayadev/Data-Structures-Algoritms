package Intro_to_problem_solving_2.Day_11_Strings;

/*
Problem Description:
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Problem Constraints
0 <= sum of length of all strings <= 1000000

Input Format : The only argument given is an array of strings A.
Output Format : Return the longest common prefix of all strings in A.

Example Input
Input 1: A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2: A = ["abab", "ab", "abcd"];

Example Output
Output 1: "a"
Output 2: "ab"

Example Explanation
Explanation 1: Longest common prefix of all the strings is "a".
Explanation 2: Longest common prefix of all the strings is "ab".
*/

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>(Arrays.asList("a", "ab", "abcd"));
        String[] pref = new String[A.size()];
        pref[0] = A.get(0);
        int minLen = Integer.MIN_VALUE;
        int minIdx = 0;
        for(int i=1; i<A.size();i++){
            StringBuilder str = new StringBuilder();
            for(int j=0; j<pref[i-1].length(); j++){
                if(j < A.get(i).length() && j<pref[i-1].length()){
                    if(A.get(i).charAt(j) == pref[i-1].charAt(j)){
                        str.append(A.get(i).charAt(j));
                    }else{
                        break;
                    }
                }else{
                    break;
                }
            }
            pref[i] = str.toString();
        }
        for(int i=0; i<pref.length; i++){
            if(pref[i].length() < minLen || minLen==Integer.MIN_VALUE){
                minLen = pref[i].length();
                minIdx = i;
            }
        }
        System.out.println(pref[minIdx]);
    }
}

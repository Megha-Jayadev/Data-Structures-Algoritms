package Intro_to_problem_solving_2.Day_11_Strings;

/*
Problem Description:
Given a string A of size N, find and return the longest palindromic substring in A.
Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
Incase of conflict, return the substring which occurs first ( with the least starting index).

Problem Constraints
1 <= N <= 6000

Input Format : First and only argument is a string A.
Output Format : Return a string denoting the longest palindromic substring of string A.

Example Input
Input 1: A = "aaaabaaa"
Input 2: A = "abba

Example Output
Output 1: "aaabaaa"
Output 2: "abba"

Example Explanation:
Explanation 1: We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
Explanation 2: We can see that longest palindromic substring is of length 4 and the string is "abba".
 */

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String A = "ac";
        StringBuilder ans = new StringBuilder();
        ans.append(A.charAt(0));
        if(A.length() == 1){
            System.out.println(A);
        }
        for(int i=0; i<A.length(); i++){
            String str1 = expand(A, i-1, i+1);
            String str2 = expand(A,i, i+1);
            if(str1.length() > ans.length() && str2.length() > ans.length() && str1.length() == str2.length()){
                ans.replace(0, ans.length(), str1);
            }else if(str1.length() > ans.length() && str2.length() < str1.length()){
                ans.replace(0, ans.length(), str1);
            }else if(str2.length() > ans.length() && str1.length() < str2.length()){
                ans.replace(0, ans.length(), str2);
            }
        }
        System.out.println(ans.toString());
    }

    private static String expand(String a, int l, int r) {
        String str = "";
        while(l>=0 && r<a.length()){
            if(a.charAt(l) == a.charAt(r)){
                l--;
                r++;
            }else{
                break;
            }
            str = a.substring(l+1, r);
        }
        return str;
    }
}

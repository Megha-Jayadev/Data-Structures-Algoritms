package Intro_to_problem_solving_1.Day_1;

/*
Problem Description :
Given a number A. Return 1 if A is prime and return 0 if not.
Note : The value of A can cross the range of Integer.

Problem Constraints : 1 <= A <= 109

Input Format : The first argument is a single integer A.
Output Format : Return 1 if A is prime else return 0.

Example Input
Input 1: A = 5
Input 2: A = 10

Example Output
Output 1: 1
Output 2: 0

Example Explanation
Explanation 1: 5 is a prime number.
Explanation 2: 10 is not a prime number.
*/


import java.util.Scanner;

public class IsPrime {

    private static int factorCount(int n){
        int count = 0;
        for(int i=1; i*i<=n;i++){
            if(n%i == 0){
                if(i == n/i){
                    count++;
                }else{
                    count+= 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int factorsCount = factorCount(A);
        if(factorsCount == 2)
            System.out.println(1);
        else
            System.out.println(0);
    }
}

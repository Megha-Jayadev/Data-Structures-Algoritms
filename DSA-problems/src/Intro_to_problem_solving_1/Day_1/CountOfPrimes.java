package Intro_to_problem_solving_1.Day_1;

/*
Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

Problem Constraints
0 <= n <= 10^3

Input Format : Single input parameter n in function.
Output Format : Return the count of prime numbers less than or equal to n.

Example Input
Input 1: 19
Input 2: 1

Example Output
Output 1: 8
Output 2: 0

Example Explanation
Explanation 1: Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
Explanation 2: There are no primes <= 1
 */
public class CountOfPrimes {

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
        int A = 19;
        int countOfPrimes = 0;
        for(int i=0; i<=A ; i++){
            int count = factorCount(i);
            if(count == 2){
                countOfPrimes++;
            }
        }
        System.out.println(countOfPrimes);
    }
}

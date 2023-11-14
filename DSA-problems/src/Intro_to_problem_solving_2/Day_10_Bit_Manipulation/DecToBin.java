package Intro_to_problem_solving_2.Day_10_Bit_Manipulation;

public class DecToBin {
    public static void main(String[] args) {
        int num = 90;
        int power = 1;
        int ans = 0;
        while(num != 0){
            int rd = num % 2;
            num = num / 2;
            ans += rd * power;
            power *= 10;
        }
        System.out.println(ans);
    }
}

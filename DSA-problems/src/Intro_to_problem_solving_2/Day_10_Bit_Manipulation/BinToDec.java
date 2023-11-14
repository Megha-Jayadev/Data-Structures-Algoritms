package Intro_to_problem_solving_2.Day_10_Bit_Manipulation;

public class BinToDec {
    public static void main(String[] args) {
        int num = 1011010;
        int ans = 0;
        int power = 1;
        while(num != 0){
            int ld = num % 10;
            num = num / 10;
            ans += ld * power;
            power *= 2;
        }
        System.out.println(ans);
    }
}

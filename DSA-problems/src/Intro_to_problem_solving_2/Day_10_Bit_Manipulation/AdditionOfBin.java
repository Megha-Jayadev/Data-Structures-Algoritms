package Intro_to_problem_solving_2.Day_10_Bit_Manipulation;

public class AdditionOfBin {
    public static void main(String[] args) {
        int n1 = 10110;
        int n2 = 00111;
        int power = 1;
        int carry = 0;
        int ans = 0;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int ld1 = n1 % 10;
            int ld2 = n2 % 10;
            n1 = n1/10;
            n2 = n2/10;
            int sum = carry + ld1 + ld2;
            ans += (sum % 2) * power;
            carry = sum / 2;
            power *= 10;
        }
        System.out.println(ans);
    }
}

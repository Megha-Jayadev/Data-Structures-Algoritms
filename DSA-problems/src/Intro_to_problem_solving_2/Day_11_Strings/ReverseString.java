package Intro_to_problem_solving_2.Day_11_Strings;

public class ReverseString {
    public static void main(String[] args) {
        String A = "the sky is blue";
        String[] str = A.split("\\s+");

        // Reverse the order of the words
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            reversedStr.append(str[i]);
            if (i > 0) {
                reversedStr.append(" ");
            }
        }

        // Remove leading and trailing spaces
        System.out.println(reversedStr.toString().trim());
    }
}

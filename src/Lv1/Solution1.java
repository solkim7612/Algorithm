package Lv1;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String answer = "";

        for (int i = 0; i < string.length(); i++) {
            answer += (string.charAt(i) > 96) ? Character.toUpperCase(string.charAt(i)) : Character.toLowerCase(string.charAt(i));
        }
        System.out.println(answer);
    }
}

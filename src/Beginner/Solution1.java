package Beginner;

import java.util.Arrays;

public class Solution1 {
    public int solution(String[] babbling) {
//        String[] word = {"aya", "ye", "woo", "ma"};
//        int answer = 0;

//        for (String string : babbling) {
//            for (String s : word) {
//                string=string.replace(s," ");
//            }
//            if(string.trim().isEmpty()) answer++;
//        }

//        return answer;

        // Stream API
        return (int) Arrays.stream(babbling)
                .map(n->n.replace("aya", " ")
                        .replace("ye", " ")
                        .replace("woo", " ")
                        .replace("ma", " "))
                .map(String::trim)
                .filter(String::isEmpty)
                .count();
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution1.solution(babbling));
    }

}

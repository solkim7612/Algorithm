package Lv2;

import java.util.Arrays;

public class Solution1 {
    public int solution(String[] babbling) {
//        String[] can={"aya", "ye", "woo", "ma"};
//        int count=0;
//
//        for(String b:babbling){
//            for(String c:can){
//                b=b.replace(c, " ");
//            }
//            if(b.trim().isEmpty()) count++;
//        }
//
//        return count;

        // Stream API
        return (int) Arrays.stream(babbling)
                .map(n -> n.replace("aya", " ")
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

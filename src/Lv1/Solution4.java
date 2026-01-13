package Lv1;

import java.util.Arrays;

public class Solution4 {
    public int solution(int[] array) {
//        String s = Arrays.toString(array);
//        int count=0;
//
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)=='7') count++;
//        }
//        return count;

        // stream API
        return (int) Arrays.toString(array)
                .chars()
                .filter(c -> c == '7')
                .count();
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] array = {10, 29};

        System.out.println(solution4.solution(array));

    }
}

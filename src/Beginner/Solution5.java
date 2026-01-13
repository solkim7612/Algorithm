package Beginner;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution5 {
    public String solution(String my_string) {
//       char[] c=my_string.toLowerCase().toCharArray();
//
//       Arrays.sort(c);
//
//        return new String(c);

        // stream API
        return Arrays.stream(my_string.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String my_string = "Bcad";

        Solution5 solution5 = new Solution5();
        System.out.println(solution5.solution(my_string));
    }
}

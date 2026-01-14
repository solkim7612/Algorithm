package Lv1;

public class Solution2 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());

        return answer;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();

        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        System.out.println(solution2.solution(my_string, overwrite_string, s));
    }
}

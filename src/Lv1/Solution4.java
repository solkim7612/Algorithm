package Lv1;

public class Solution4 {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int index = (a == b && b == c) ? 3 : 2;

        if (a != b && b != c) return a + b + c;

        for (int i = 1; i <= index; i++) {
            answer *= (int) (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();

        int a = 2;
        int b = 6;
        int c = 1;

        System.out.println(solution4.solution(a, b, c));
    }
}

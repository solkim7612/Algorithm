package Lv1;

public class Solution3 {
    public String solution(String code) {
        String ret="";
        String[] c=code.split("");
        int mode=0;

        for(int i=0; i<c.length; i++) {
            if(c[i].equals("1")){
                mode=(mode==0)? 1:0;
                continue;
            }
            if(i%2==mode) ret+=c[i];
        }

        return ret.isEmpty()? "EMPTY":ret;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();

        String code = "abc1abc1abc";

        System.out.println(solution3.solution(code));
    }
}

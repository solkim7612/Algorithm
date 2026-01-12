package Beginner;

public class Solution3 {
    public int solutuin(String A, String B){
        if(A.equals(B)) return 0;

        for(int i=0; i<A.length(); i++){
            String a=A.substring(0,A.length()-1);
            String b=A.substring(A.length()-1);
            A=b+a;
            if(A.equals(B)){
                return i+1;
            }
        }

        return -1;

//        방법 2:
//        return (B+B).indexOf(A);

    }

    public static void main(String[] args) {
        String A="atat";
        String B="tata";
        Solution3 solution3=new Solution3();

        System.out.println(solution3.solutuin(A,B));
    }
}

public class LongestCommonSequence {
    public static int lcs(String A,String B,int A_length,int B_length){
        if (A_length==0 || B_length==0){
            return 0;
        }
        if(A.charAt(A_length-1)==B.charAt(B_length-1)){
            return 1+lcs(A,B,A_length-1,B_length-1);
        }
        else {
            return max(lcs(A,B,A_length,B_length-1),lcs(A,B,A_length-1,B_length));
        }
    }
    public static int max(int X,int Y){
        return Math.max(X,Y);
    }

    public static void main(String[] args) {
        String A="AGGTAB";
        String B="GXTXAYB";
        System.out.println("Longest Common Subsequence will be of length:"+lcs(A,B,A.length(),B.length()));
    }
}

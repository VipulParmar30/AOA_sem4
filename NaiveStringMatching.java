public class NaiveStringMatching {
    public static void search(String text,String pattern){
        int textLength=text.length();
        int patternLength=pattern.length();
        for (int i = 0; i <= textLength-patternLength; i++) {
            int j;
            for (j = 0; j <patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if(j==patternLength){
                    System.out.println("Pattern found at Index:"+i);
                }

        }
    }

    public static void main(String[] args) {
        String text="parmarvipulparmarvipul";
        String pattern="vipul";
        search(text,pattern);
    }
}

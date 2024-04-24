import java.util.*;
public class RabinKarp {
   static final int prime=101;

   static double calculateHash(String str){
      double hash=0;
      for(int i=0;i<str.length();i++){
         hash= (hash+ str.charAt(i)*Math.pow(prime,i));

      }
      return hash;
   }
   static double updateHash(double prevHash, char oldChar, char newChar, int patternLength){
      double newHash=(prevHash-oldChar)/prime;
      newHash=newHash+ (newChar*Math.pow(prime,patternLength-1));
      return newHash;
   }
   public static void search(String text, String pattern){
      int patternLength=pattern.length();
      double patternHash=calculateHash(pattern);
      double textHash=calculateHash(text.substring(0,patternLength));

      for(int i=0;i<= text.length()-patternLength;i++){

         if(textHash == patternHash){
            if (text.substring(i,i+patternLength).equals(pattern)) {
               System.out.println("Pattern found at Index:" + i);
            }
         }
         if(i<text.length()-patternLength){
            textHash=updateHash(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
         }
      }

   }

   public static void main(String[] args) {
      String text="ParmarVipul";
      String Pattern="Vipul";
      search(text,Pattern);
   }
}

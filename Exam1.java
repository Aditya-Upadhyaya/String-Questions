import java.util.regex.*;

public class Exam1 {
   public static void main(String[] args) {
      String str = "gtyg";
     Pattern p = Pattern.compile("[a-zA-Z]");
     Matcher m = p.matcher(str);
     int count=0;
     
     while (m.find()) {
       count++;
     }
     int flag=0;
     if(count==str.length()){
        char c[] = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
           for (int j = 0; j < c.length; j++) {
              if (i==0) {
                 if (c[i]==c[j+1]) {
                    flag=1;
                    break;
                 }
                 else{
                    flag=0;
                 }
              }
              else{
                 if (c[i]==c[j]) {
                    flag=1;
                    break;
                 }
                 else{
                    flag=0;
                 }
              }
           }
           if (flag==0) {
              System.out.println(c[i]);
           }
           flag=0;
        }
     }
     else
     {
      System.out.println("flase");
     }
   }
}


import java.util.*;
public class Example1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len= A.length()+B.length();
        System.out.println(len);
        int s = Integer.signum(A.compareTo(B));
        System.out.println(s);
        if (s==-1) {
            System.out.println("Yes");
            
        }
        else
        {
            System.out.println("No");
            
        }
        // String ab = A.substring(0, 1);
        String ac = A.substring(1, A.length());
        String ad = A.substring(0, 1).toUpperCase();

        String bc = B.substring(1, B.length());
        String bd = B.substring(0, 1).toUpperCase();
        
        
        System.out.println(ad.concat(ac) + " " + bd.concat(bc));

        
        
      sc.close();
        
}
}
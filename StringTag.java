import java.util.*;

public class StringTag {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        // int n = src.nextInt();
        String sr[] = {"-100", "50","0","56.6","90","0.12","4.12","02.45","000.000",".12"};
    
        String temp=" a";
        for (int i = 0; i <= sr.length-1; i++) {
            for (int j = 0; j < sr.length-1-i; j++) {

                if (Float.parseFloat(sr[j])<Float.parseFloat(sr[j+1])) {
                    temp=sr[j];
                    sr[j]=sr[j+1];
                    sr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < sr.length; i++) {
            System.out.println(sr[i]);
        }
        
       




        src.close();
    }
}
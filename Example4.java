public class Example4 {
    public static void main(String[] args) {
        String str1="anagram";
        String str2= "margana";


        String str3=str1.toLowerCase().trim();
        String str4=str2.toLowerCase().trim();

        char A[]= new char[str3.length()];
        char B[]= new char[str4.length()];
        for (int i = 0; i < A.length; i++) {
            A[i]=str3.charAt(i);
        }
        for (int i = 0; i < B.length; i++) {
            B[i]=str4.charAt(i);
        }
        char temp;

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (A[i] > A[j]) {
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = i; j < B.length; j++) {
                if (B[i] > B[j]) {
                    temp=B[i];
                    B[i]=B[j];
                    B[j]=temp;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
        System.out.println();
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
        } 
        System.out.println();
        String P =new String(A);
        String Q =new String(B);
        if (P.equalsIgnoreCase(Q)) 
        {
            
            
            System.out.println("true");



        } else {
            System.out.println("false");
        }
    }
}

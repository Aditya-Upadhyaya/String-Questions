public class Example3 {
    public static void main(String[] args) {
        String str= "madamsir";
        
        int len=str.length();
        char A[]=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            A[len-1]=str.charAt(i);
            len=len-1;
        }
        String str2 = new String(A);
        if (str2.equalsIgnoreCase(str)) {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}

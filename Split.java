public class Split {
    public static void main(String[] args) {
        String str="He is a very very good boy, isn't he?";
        
        String A[]=str.split("[,_'?!@.\\s]+", 0);
        System.out.println(A.length);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        

    }
}

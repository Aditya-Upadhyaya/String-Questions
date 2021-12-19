

public class ReverseWordInStr {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        String s[] = str.split("[.]");
        String s1[]= new String[s.length + s.length -1];
        int c =0;
        for (int i = s.length-1; i >= 0 ; i--) {
           s1[c]=s[i];
           c++;
            if (i!=0) {
                s1[c]=".";
                c++;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s1.length; i++) {
            sb.append(s1[i]);
        }
        String stt = sb.toString();
        System.out.println(stt);
    }
}

public class HTMLTagRemover {
    public static void main(String[] args) {
        String str = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par><h1>some</h1>";
        int start = 0, end = 0;
        char C[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int another = -1;
        char c =' ';
        int flag=0;
        int end2=0;
        for (int i = 0; i < C.length; i++) {
            if (C[i] == '<' && C[i + 1] != '/') {
                sb.delete(0, sb.length());
                int j = i + 1;
                while (C[j] != '>') {
                    sb.append(C[j]);
                    j++;
                }
                start = j;
            }
            if (C[i] == '<' && C[i + 1] == '/') {
                int j = i + 2;
                while (C[j] != '>') {
                    sb2.append(C[j]);
                    j++;
                }
                end = i;
                end2=j;
                break;
            }
        }
        for (int i = end2; i < C.length; i++) {
            if (C[i] == '<' && C[i + 1] != '/') {
                int j = i + 2;
                while (C[j] != '>') {
                    j++;
                }
                if (C[j+1]=='<' && C[j + 2] == '/') {
                    flag++;
                    another=j;
                    c = C[j+1];
                }
                break;
            }
        }
        
        String s1 = sb.toString();
        String s2 = sb2.toString();

        if (s1.equals(s2)) {
            for (int i = start + 1; i < end; i++) {
                System.out.print(C[i]);
            }
        } else {
            System.out.println("None");
        }
        System.out.println();
        System.out.println("Another = " + another + " c = " + c +" Flag = " +flag);
    }
}

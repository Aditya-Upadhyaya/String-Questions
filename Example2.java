public class Example2 {
  
    public static void main(String[] args) {
        String str ="welcometojava";
        int count=0;
        String str2[] = new String[str.length()*str.length()];
        
        int pk=str.length()*str.length();
        int it=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                    
                   if (j-i==3) {
                    if(it<pk){
                        str2[it]=str.substring(i,j);
                        it++;
                    }
                  
                   } 
                
                
            }
        }
        for (int i = 0; i < str2.length; i++) {
            if (str2[i]!=null) {
                count++;
              }
        }
        String str3[] = new String[count];
        for (int i = 0; i < str3.length; i++) {
            str3[i]=str2[i];
        }
        String temp="";
        for (int i = 0; i < str3.length; i++) {
            for (int j = i; j < str3.length; j++) {
                if (str3[i].compareToIgnoreCase(str3[j])>0) {
                    temp=str3[i];
                    str3[i]=str3[j];
                    str3[j]=temp;
                }
            }
        }
        
       if (str.matches("^[a-zA-Z]\\w{1,50}$")) {
        System.out.println("true");
       }
       else{
        System.out.println("false");
       }
       
        
        
    }
}

public class FrequencyOfChar {
   public static void main(String[] args) {
    
    String str = "aaabbcccdd";
    
    for(int i=0;i<str.length();i++){
        int count =0;
        for(int j=0;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
        }
        boolean isAlreadyCounted = false;
        for(int k=0;k<i;k++){
            if(str.charAt(i) == str.charAt(k)){
                isAlreadyCounted = true;
            }
        }
        if(!isAlreadyCounted){
            System.out.print(str.charAt(i)+""+count);
        }
    }

   } 
    
}

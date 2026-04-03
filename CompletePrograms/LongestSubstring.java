
public class LongestSubstring {

    public static void main(String[] args) {
        
        String str = "abccde";
        int maxLength =0; 

        for(int i=0;i<str.length();i++){
            boolean [] isVisted = new boolean[256];
            int currentLength =0;
            for(int j=i;j<str.length();j++){
                if(isVisted[str.charAt(j)]){
                    break;
                }
                isVisted[str.charAt(j)] = true;
                currentLength++;
            }
            if(currentLength>maxLength){
                maxLength=currentLength;
            }
        }
        System.out.println(maxLength);

    }
}

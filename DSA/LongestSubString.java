public class LongestSubString {
    public static void main(String[] args) {
        String str = "naveen";

        int maxLength = 0;
        for(int i=0;i<str.length();i++){
            boolean[]visted = new boolean[256];
            int currentLength =0;
            for(int j=i;j<str.length();j++){
                if(visted[str.charAt(j)]){
                    break;
                }
                visted[str.charAt(j)]=true;
                currentLength++;
            }
            if(currentLength>maxLength){
                maxLength=currentLength;
            }
        }
        System.out.println(maxLength);
    }
}

public class ReplaceString {
    public static void main(String[] args) {
        
        String s = "banana";
        char ch[] = s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'){
                ch[i]='o';
            }
        }
        for(char n:ch){
            System.out.print(n);
        }

    }
}

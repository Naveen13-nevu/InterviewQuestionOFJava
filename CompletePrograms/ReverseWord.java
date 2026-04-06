

public class ReverseWord {

    public static String RevWords(String str){

        String [] words = str.split(" ");
        String rev = "";
        for(int i=words.length-1; i>=0;i--){
            rev = rev + words[i];
            if(i!=0){
                rev = rev+" ";
            }
        }
        return rev;
    }


    public static void main(String[] args) {

        String str = " Java is easy";
        String  result = RevWords(str);
        System.out.println(result);

        
    }
}

public class FrequenceOfChar {

    public static void main(String[] args) {
        
        String str = "aabbcc";

        for(int i=0;i<str.length();i++){
            int count =1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            boolean isAlreadyCounted = false;
            for(int k=0;k<i;k++){
                if(str.charAt(i) == str.charAt(k)){
                    isAlreadyCounted = true;
                    break;
                }
            }

            if(!isAlreadyCounted){
                System.out.print(str.charAt(i)+""+count);
            }
        }


    }
}

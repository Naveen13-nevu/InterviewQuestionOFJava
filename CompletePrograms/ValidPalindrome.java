public class ValidPalindrome {
    
    public static boolean isValid(String s){

        int left=0;
        int right = s.length()-1;

        while(left<right){


            while(left< right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }


            left++;
            right--;
        }

        return true;
    }

public static void main(String[] args) {
    
    String str = "A man, a plan, a canal: Panama";
    boolean result = isValid(str);
    System.out.println(result);


    }
}

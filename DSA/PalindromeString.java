public class PalindromeString {
    public static void main(String[] args) {
        String str = "noon";
        int left= 0;
        int right = str.length()-1;
        boolean isPalindrome = false;
        while(left<right){

            if(str.charAt(left)== str.charAt(right)){
                isPalindrome = true;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }

    }
}

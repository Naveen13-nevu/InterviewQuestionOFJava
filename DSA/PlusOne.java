public class PlusOne {
    public static  int[] plus(int[] digits) {

        // start from last digit
        for(int i = digits.length - 1; i >= 0; i--) {

            // if digit is less than 9
            if(digits[i] < 9) {
                digits[i]++;   // add 1
                return digits; // done
            }

            // if digit is 9
            digits[i] = 0; // make it 0 and carry to next digit
        }

        // if all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
    public static void main(String[] args) {
        int digits[] = {1,2,3};
       plus(digits);
       for(int p:digits){
        System.out.print(p);
       }
    }
}
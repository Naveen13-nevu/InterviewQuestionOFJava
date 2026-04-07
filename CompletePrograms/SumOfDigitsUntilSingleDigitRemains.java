public class SumOfDigitsUntilSingleDigitRemains {
 

    public static int digit(int n){

        while(n>=10){
            int sum =0;
            while(n>0){
                int d = n%10;
                sum = sum+d;
                n=n/10;
            }
            n = sum;
        }

        return n;
    }
    public static void main(String[] args) {

        int n = 9876;

        int result = digit(n);
        System.out.println(result);
        

    }


}

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }
    
            for(int i=2;i<n;i++){
                if(n%i==0){
                isPrime = false;
                break;
                }
            }
        
        if(isPrime){
            System.out.println("is a prime number");
        }
        else{
            System.out.println("is not a prime number");
        }

    }
}

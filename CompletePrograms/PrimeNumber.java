
public class PrimeNumber {
    
    public static void main(String[] args) {
        
        int n=13;
        boolean isPrime = true;

        if(n<=1){
            isPrime = false;
        }

        for(int i=2;i<n;i++){
            if(n%2 == 0){
                isPrime = false;
            }

        }
        if(isPrime){
            System.out.print(n + " is a prime number");
        }
        else {
            System.out.print(n + " is not a prime number");
        }


    }
}

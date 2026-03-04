
public class ProductOfDigit {
    public static void main(String[] args) {
        int n=1234;
        int product =1;
        while(n>0){
            int d = n%10;
            product = product*d;
            n=n/10;
        }
        System.out.println(product);
    }
}

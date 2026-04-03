
public class Factorial {

    public static int fac(int n){
        if(n==0||n==1){
            return 1;
        }

        return n * fac(n-1);
    }
    
    public static void main(String[] args) {
        
        int n = 4;

        System.out.println(fac(n)+ " ");

    }
}


public class ArmstrongNumber {
    
    public static void main(String[] args) {
        
        int n =153;
        int orginal = n;
        int sum =0;

        while(n>0){
            int d = n%10;
            sum = sum + d*d*d;
            n = n/10;
        }

        if(sum == orginal){
            System.out.println(orginal+ " it is a armstrong number");
        }
        else{
            System.out.println(orginal+ " it is not a armstrong number");
        }



    }
}

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 12;
        int orginal = n;
        int sum =0;
        while(n>0){
            int d = n%10;
            sum = sum+d*d*d;
            n = n/10;
        }
        if(orginal == sum){
            System.out.println(orginal+" ->"+" is a amstromg number.");
        }
        else{
            System.out.println(orginal+" ->"+" is not a armstrong number ");
        }
    }
}

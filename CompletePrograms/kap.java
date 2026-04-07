

public class kap {
    

    public static void main(String[] args) {
        int num = 1178;
        int result =0;

        while(num != 6174){
            int temp = num;

            int digits[] = new int[4];
            int n = digits.length;

            for(int i=0;i<4;i++){
                digits[i] = temp%10;
                temp = temp/10;
            }

            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(digits[j] > digits[j+1]){
                        int swap = digits[j];
                        digits[j] = digits[j+1];
                        digits[j+1] = swap;

                    }
                }
            }
          

            int asc =0;
            int des =0;

            for(int i=0;i<4;i++){
                asc = asc *10+digits[i];
            }

            for(int i=3;i>=0;i--){
                des = des * 10+digits[i];
            }

            result = des -asc;
            System.out.println(asc +" - "+ des+"-> "+result);
            num = result;


        }
        System.out.println("the constant reached : "+ result);



    }
}

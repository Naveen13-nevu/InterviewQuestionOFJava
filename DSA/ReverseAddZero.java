public class ReverseAddZero {
    public static void main(String[] args) {
        
        int num =1234;
        int temp = num;
        int  reverse =0;
        int count =0;


        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=num;

        while(temp>0){
            int d = temp%10;
            reverse = reverse*10+d;
            temp = temp/10;
        }

        for(int i=0;i<count;i++){
            reverse = reverse*10;
        }
        System.out.print(reverse);

    }
}

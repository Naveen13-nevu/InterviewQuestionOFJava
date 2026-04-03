
public class MaxSubArray {
    
    public static void main(String[] args) {
        int arr[] = {1,2,-5,4,5,-1,-4};

        int sum = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(sum <0){
                sum = arr[i];
            }
            else{
                sum = sum +arr[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);


    }
}

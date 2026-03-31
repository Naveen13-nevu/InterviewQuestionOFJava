public class KadaneAlgorithm {
    public static int kadane(int arr[]){

        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i=0;i<arr.length;i++){
            if(currentSum < 0){
                currentSum = arr[i];
            }
            else{
                currentSum = currentSum+arr[i];
            }
            if(currentSum>maxSum){
                maxSum = currentSum;
            }
        }


        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = kadane(arr);
        System.out.println(result);
    }
}

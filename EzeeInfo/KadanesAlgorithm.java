
public class KadanesAlgorithm {
    
    public static int maxSum(int arr[]){
        int currentSum = arr[0];
        int maxSum = arr[0];


        for(int i=0;i<arr.length;i++){
            if(currentSum <0){
                currentSum = arr[i];
            }
            else{
                currentSum = currentSum+arr[i];
            }
            if(currentSum>maxSum){
                maxSum = currentSum;
            }
        }
        return  maxSum;
    }


    public static void main(String[] args) {
        
        int arr[] = { 1,2,-5,4,5,-10};
        System.out.println(maxSum(arr));
    }
}

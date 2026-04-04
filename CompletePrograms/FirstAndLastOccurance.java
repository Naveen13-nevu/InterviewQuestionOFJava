public class FirstAndLastOccurance {

    public static int firstOccur(int arr[], int target){
        int low =0;
        int high = arr.length-1;
        int result = -1;

        while(low <= high){

            int mid = low + (high-low) /2;
            if(arr[mid] == target){
                result = mid;
                high = mid-1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }

        }

        return result;
    }

    public static int lastOccur(int arr[], int target){

        int low =0;
        int high = arr.length-1;
        int result=-1;

        while(low<=high){
            int mid = low +(high-low)/2;

            if(arr[mid] == target){
                result = mid;
                low = mid+1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return result;
    }




    public static void main(String[] args) {
        
        int arr[] = {10,20,20, 20, 20, 30,40};
        int target = 20;
        int result1 =   firstOccur(arr,target);
        int result2 = lastOccur(arr, target);
        System.out.println("First occurance is: "+result1);
        System.out.println("First occurance is: "+result2);


    }
}

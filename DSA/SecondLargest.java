public class SecondLargest {
    public static void main(String[] args) {
        
        int arr [] = {10,20,30,40,50};

        if(arr.length<2){
            System.out.println("No second largest element");
            return;
        }

        int FirstLargest = arr[0];
        int SecondLargest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>FirstLargest){
                SecondLargest = FirstLargest;
                FirstLargest = arr[i];
            }
            else if(arr[i]>SecondLargest && arr[i] != FirstLargest){
                SecondLargest = arr[i];
            }
        }
        if(FirstLargest == SecondLargest){
            System.out.println("No second largest element");
        }
        else{
            System.out.println("the second largest element is : "+ SecondLargest);
        }

    }
}

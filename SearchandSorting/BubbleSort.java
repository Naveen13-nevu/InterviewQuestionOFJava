
public class BubbleSort {

    public static void bubble(int arr[]){
    int n = arr.length;
    for(int i=0;i<n-1;i++){

        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int swap = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = swap;
            }
        }
    }


    }

    public static void main(String[] args) {
        int arr[] = {10,40,50,4,30};
        
        bubble(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
       
    }
}


public class InsertionSort {
    public static void Insert(int arr[]){

        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,6,8,7,9};
        Insert(arr);
        for(int n: arr){
            System.out.print(n+" ");
        }
    }
}

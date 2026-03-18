import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int count =0;
      System.out.println("enter the 10 unique elements: ");

      while(count<10){
        int num = sc.nextInt();

        boolean isDuplicate = false;
        for(int i=0;i<count;i++){
            if(arr[i] == num){
                isDuplicate = true;
                break;
            }
        }
        if(isDuplicate){
            System.out.println("Enter the unique element: ");
        }
        else{
            arr[count++] = num;
        }

      }
      


        //Sorting first five elements  :

        for(int i =0;i<5-1;i++){
            for(int j=0;j<5-i-1;j++){
                
                if(arr[j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= swap;
                }
            }
        }
        // next the last 5 elements :

        for(int i =5;i<10-1;i++){
            for(int j = 5; j<10-(i-5)-1;j++){
                if(arr[j]<arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }

        for(int n: arr){
            System.out.print(n+" ");
        }

    }
}

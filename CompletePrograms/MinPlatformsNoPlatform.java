public class MinPlatformsNoPlatform {
    
      public static void bubleSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int maxPlatform(int arr[], int dep[]){


        int n = arr.length;

        bubleSort(arr);
        bubleSort(dep);

        int i=0;
        int j=0;
        int platform = 0;
        int maxPlatoform =0;

        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                platform++;
                i++;
            }
            else{
                platform--;
                j++;
            }
            if(platform> maxPlatoform){
                maxPlatoform = platform;
            }
        }


        return  maxPlatoform;
    }


  

    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
	    int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int result = maxPlatform(arr,dep);
        System.out.println(result);

    }
}

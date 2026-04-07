
public class Merge{
    
    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,4};
        int arr2[] = {1,3,4,6};

        int result[] = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
                k++;
            }
            else{
                result[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(i<arr1.length){
            result[k] = arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            result[k] = arr2[j];
            k++;
            j++;
        }

        for(int n: result){
            System.out.print(n+" ");
        }
    }
}

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        
        int arr1 [] = {1,2,3};
        int arr2 [] = {4,5,6};
        int result []= new int[arr1.length+arr2.length];

        int i = 0; int j=0;int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){

                result[k++]= arr1[i++];
            }
            else{
                result[k++]=arr2[j++];
            }
           
        }
        while(i<arr1.length){
            result[k++] = arr1[i++];
        }
         while(j<arr1.length){
            result[k++] = arr2[j++];
        }
        for(int n : result){
            System.out.print(n+" ");
        }
    }
}


public class checkAnagram {

    public static boolean checkAnagram(String str1,String str2)
    {

        if(str1.length() != str2.length()){
            return false;
        }

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        bubbleSort(arr1);
        bubbleSort(arr2);

        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void bubbleSort(char[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]> arr[j+1]){
                    char swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }



    public static void main(String[] args) {
        
        String str1 = "listen";
        String str2 = "silent";

        boolean result = checkAnagram(str1,str2);
        System.out.println(result);

    }
}

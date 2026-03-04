public class ReverseString {
    public static void main(String[] args) {
        String str = "naveen";
        
        char []arr = str.toCharArray();
        int left = 0; 
        int right = arr.length-1;
        while(left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }

        for(char n:arr){
            System.out.print(n);
        }
    }
}

public class Day01ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12,25,48,75};
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left ++;
            right--;
        }
        System.out.print("Reversed array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

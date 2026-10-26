import java.util.Arrays;
public class Day01ReverseArray {
    public static void main(String[] args) {
        //int[] sales = {12,25,48,75};
        int[] sales = {1200, 1500, 900, 2000, 1800};
        int left = 0;
        int right = /*arr*/sales.length -1;
        while(left < right){
            /*int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left ++;
            right--;*/
            int temp = sales[left];
            sales[left ]= sales[right];
            sales[right] = temp;
            left++;
            right--;
        }
        System.out.print("Reversed array is: "+Arrays.toString(/*arr*/sales));
        /* 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            */
    }
}

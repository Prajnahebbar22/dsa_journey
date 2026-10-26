import java.util.Arrays;
class revKShifts{
    static void reverse(int[] arr,int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    static void rearrange(int[] arr, int k){
        int n = arr.length;
        if(n ==0){
            return;
        }
        k = k%n;
        
        reverse(arr,0,n-1);//full
        reverse(arr,0,k-1);//first k
        reverse(arr,k ,n-1); //last n-k
    }


    public static void main(String[] args){
        int[] stops = {10,20,30,40,50,60,70};
        int k=2;
        rearrange(stops,k);
        System.out.println(Arrays.toString(stops));
}
}



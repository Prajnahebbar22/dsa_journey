import java.util.Arrays;
class BSUnsort{
    public static void main(String[] args){
        int[] arr = {2,56,78,14,23,65,11};
        int target = 11;
        int low = 0;
        int foundIndex = -1;
        int high = arr.length-1;
        for(int i=0;i<arr.length -1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                foundIndex = mid;
                break;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        if(foundIndex !=-1){
            System.out.println(foundIndex);
        }else{
            System.out.println("Not found!!");
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
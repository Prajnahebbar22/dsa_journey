import java.util.*;
class BinarySearch{
    public static void main(String[] args){
    int[] arr = {18,5,34,72,91,26};
    int target = 34;
    int foundIndex = -1;
    int left = 0;
    int right = arr.length -1;
    while(left<=right){
        int mid = (left+right)/2;
        if(arr[mid] == target){
            foundIndex = mid;
            break;
        }else if(arr[mid]< target){
            left = mid+1;
        }else{
            right = mid-1;
        }
    }
    System.out.println("Found at index:"+foundIndex);
}
}
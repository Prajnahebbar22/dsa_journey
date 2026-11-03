import java.util.*;
class MaxSAS{
    public static void main(String[] args){
        int[] arr = {-2,-3,1,4,-1,2,1,-5,3};
        int maxSum = arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum +=arr[k];
                }
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
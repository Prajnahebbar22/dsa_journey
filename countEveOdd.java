import java.util.*;
class countEveOdd{
    public static void main(String[] args){
        int[] arr = {14,5,21,36,6,98};
        int countEven=0;
        int countOdd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("No.of even: "+countEven);
        System.out.print("No.of odd :"+countOdd);
    }
}
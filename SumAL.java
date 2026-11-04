import java.util.*;
class SumAL{
    public static void main(String[] args){
        int[] arr = {5,1,5,2,1,2,1,4,1,6,9};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}

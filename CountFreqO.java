import java.util.*;
class CountFreqO{
    public static void main(String[] args){
        int[] arr = {1,4,1,5,2,4,1,5,2,3};
        HashMap<Integer,Integer> frequency =  new HashMap<>();
        for(int num:arr){
            frequency.put(num,frequency.getOrDefault(num,0) +1);
        }
        System.out.println(frequency);
    }
}
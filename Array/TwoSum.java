import java.util.HashMap;
class TwoSum{
    public static void main(String[] args){
        int[] arr = {3,4,5,10};
        int target = 8;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            int complement = target-arr[i];
            if(map.containsKey(complement)){
                System.out.println((complement)+","+arr[i]);
            }
            map.put(arr[i],i);
        }
    }
}
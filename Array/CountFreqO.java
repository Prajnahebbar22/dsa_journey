import java.util.HashMap;
class CountFreqO{
    public static void main(String[] args){
        int[] arr = {1,4,1,5,2,4,1,5,2,3};
        HashMap<Integer,Integer> frequency =  new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(frequency.containsKey(num)){
                frequency.put(num,frequency.get(num)+1);
            } else{
                frequency.put(num,1);
            }
        }
        System.out.println(frequency);
    }
}
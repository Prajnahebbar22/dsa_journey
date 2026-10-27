import java.util.HashMap;
class DupUnsortA{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5,5,6};
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int num:arr){
            frequency.put(num, frequency.getOrDefault(num,0) +1);
        }
        System.out.println("Dup elements:");
        for(int num:frequency.keySet()){
            if(frequency.get(num)>1){
                System.out.print(num+" ");
            }
        }
    }
} 
    



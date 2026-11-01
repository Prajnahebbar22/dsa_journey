import java.util.*;
class PSAL{
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>(
        Arrays.asList(4,2,15,98,16)
        );
        int min = list.get(0);
        int minIndex = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<min){
                min = list.get(i);
                minIndex = i;
            }
        }
        System.out.println("Value:"+min+", Position:"+minIndex);
    }
}
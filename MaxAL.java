import java.util.ArrayList;
import java.util.Arrays;
public class MaxAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
        Arrays.asList(4,2,15,98,16)
    );
        int max = list.get(0);
        int maxIndex = 0;
        for(int i=1;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
                maxIndex=i;
            }
        }
        System.out.println("Value:"+max);
            System.out.print("Position:"+maxIndex);
    }
}
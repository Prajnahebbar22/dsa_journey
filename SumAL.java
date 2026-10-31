import java.util.ArrayList;
import java.util.List;
class SumAL{
    public static void main(String[] args){
        int sum = 0;
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}

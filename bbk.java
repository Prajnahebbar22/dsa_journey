import java.util.ArrayList;
import java.util.List;

public class bbk {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(5);
        list.add(21);
        list.add(36);
        list.add(6);
        list.add(98);

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                continue;
            }else{
                System.out.println(list.get(i));
            }
        }
    }
}

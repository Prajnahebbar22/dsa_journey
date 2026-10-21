class LinearSearch{
    public static void main(String[] args){
        String[] arr = {"Python","JavaScript","Java","GoLang"};
        String target = "Javi";
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found:"+i);
            }
        }
    }
}
 /* 
import java.util.*;
class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 60;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Element not found");
        }
    }
}
*/
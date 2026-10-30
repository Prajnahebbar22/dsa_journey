public class bbk {
    public static void main(String[] args){
        int[] arr = {14,5,21,36,6,98};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                continue;
            }else{
                System.out.println(arr[i]);
            }
        }
    }
}

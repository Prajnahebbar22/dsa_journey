class DupliSortedA{
    public static void main(String[] args){
        int[] arr = {1,2,2,5};
        int j = 0;
        for(int i= 1;i< arr.length ; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
            int length = j+1;
            for (int i = 0; i <length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("Unique Elements:"+length);
        }
    }

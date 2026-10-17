class Smallestarray {
    public static void main(String[] args){
        int[] arr = {12,15,2,48,4};
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
    
}

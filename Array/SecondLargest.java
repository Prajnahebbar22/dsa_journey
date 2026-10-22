class SecondLargest{
    public static void main(String[] args){
        int[] arr = {18,5,34,74,91,26};
        int largest = arr[0];
        int SecondLargest = Integer.MIN_VALUE;
        for(int i = 1;i< arr.length;i++){
            if(arr[i]>largest){
                SecondLargest = largest;
                largest = arr[i];
            }else if (arr[i]<largest && arr[i]> SecondLargest){
                SecondLargest = arr[i];
            }
        }
        System.out.println("Largest Element:"+largest);
        System.out.print("Second largest Element:"+SecondLargest);
    }
}
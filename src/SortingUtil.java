public class SortingUtil {
    public static void swap(int[] arr,int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j]=t;
    }

    public static void BubbleSort(int[] arr){
        int x = arr.length-1;
        int stop;
        int swaps = 1;
        while(swaps>0){
            swaps = 0;
            stop = x;
            for(int i = 0;i<stop;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    swaps++;
                    x = i;
                }
            }
        }
    }


}

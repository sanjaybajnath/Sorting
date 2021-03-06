public class SortingUtil {

    public static int[] copyIntArray (int[] arr){
        int[] copy = new int[arr.length];
        for(int i = 0; i< arr.length;i++){
            copy[i] = arr[i];
        }
        return copy;

    }
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

    public static void SelectionSort (int[] arr){
        int curPos = 0;
        int minPos = 0;
        int minValue = arr[curPos];
        while(curPos<arr.length){
            minPos = curPos;
            minValue = arr[curPos];
            for(int i = curPos +1;i<arr.length;i++){

                if(arr[i]<minValue){
                    minValue = arr[i];
                    minPos = i;
                }
            }
            swap(arr,minPos,curPos);
            curPos++;
        }
    }

    public static void InsertionSort (int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }


}

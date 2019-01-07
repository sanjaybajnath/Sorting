public class Runner {

    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i = 0; i<count;i++){
            arr[i] = (int)(Math.random() * 10001);
        }
        return arr;
    }

    public static boolean isSorted(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after){
        int s1 = 0;
        int s2 = 0;
        for(int i = 0; i < before.length;i++){
            s1+= before[i];
            s2+= after[i];
        }
        return (s1==s2);
    }
    public static void main(String[] args) {
        long time = System.nanoTime();
        int [] array1 = randIntArr(1000);
        int[] array2 = array1;
        SortingUtil.BubbleSort(array2);
        time = System.nanoTime() - time;

        System.out.println("Time taken: "+ time);
        System.out.println("isSorted: "+isSorted(array2));
        System.out.println("checkSum: "+checkSum(array1, array2));
    }
}

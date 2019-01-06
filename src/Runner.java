public class Runner {

    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i = 0; i<count;i++){
            arr[i] = (int)(Math.random() * 10001);
        }
        return arr;
    }
    public static void main(String[] args) {
        long time = System.nanoTime();
        SortingUtil.BubbleSort(randIntArr(1000));
        time = System.nanoTime() - time;

        System.out.println("Time taken: "+ time);

    }
}

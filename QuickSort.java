public class QuickSort {
    public void sort(double[] arr){
        quicksort(arr,0,arr.length-1);
    }
    private void quicksort(double[] arr, int bot, int top){
        if(bot<top){
            int p = partition(arr,bot,top);
            quicksort(arr,bot,p-1); //recursion for left side
            quicksort(arr,p+1,top); //recursion for right side
        }
    }
    public int partition(double[] arr, int left, int right){
        int bot = left;
        int pivot = right;
        int top = right;
        if(left<right){
            while(bot<=top){
                while(bot<right && arr[bot] < arr[pivot]) //checking to see if anything left of pivot is larger than pivot
                    ++bot;
                while(top>=bot && arr[top] >= arr[pivot]) //same but top and if smaller
                    --top;
                if(bot<top)
                    swap(arr,bot,top);
                else
                    swap(arr,bot,pivot);
            }
        }
        return bot;
    }
    public void swap(double[] arr, int bot, int pivot){
        double temp = arr[bot];
        arr[bot] = arr[pivot];
        arr[pivot] = temp;
    }
}
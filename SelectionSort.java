public class SelectionSort {
    public void sort(double[] arr){
        for (int i=0; i < arr.length-1; i++){
            swap(arr,i,findSmallest(arr,i));
        }
    }
    public int findSmallest(double[] arr, int start){
        int smallest = start; //always going to be smallest variable to me moved
        for (int i = start+1; i < arr.length; i++) {
            if (arr[i] < arr[smallest])
                smallest = i;
        }
        return smallest;
    }
    public void swap(double[] arr, int i, int j){ //swaps to input numbers in an array.
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
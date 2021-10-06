public class BubbleSort {
    public void sort (double[] arr){
        for (int i = 0; i <arr.length-1;i++){
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    public void swap(double[] arr, int i, int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
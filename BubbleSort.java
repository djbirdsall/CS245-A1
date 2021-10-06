public class BubbleSort {
    public void sort (double[] arr){
        for (int i = 0; i <arr.length-1;i++){
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr, j, j + 1); //swaps two numbers if one number is smaller than the next number in the array.
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
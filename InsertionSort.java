public class InsertionSort {
    public void sort(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            double temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temp){ //replaces space in array while shifting rest of array over one.
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1] = temp;
        }
    }
}
public class MergeSort {
    public void sort(double[] arr){ //I made mergesort!! WHOOPIE
        if(arr.length > 1){ //anything larger than 1 can still be split
            double[] left = get_left(arr); //creating left array
            double[] right = get_right(arr); //creating right away with remaining elements
            sort(left); //recursion for splitting left array further and sorting!
            sort(right); //same for right!
            merge(arr, left, right); //merge it up the ladder!
        }
    }
    public double[] get_left(double[] arr){
        int size = arr.length/2; //first half of the array
        double[] left = new double[size];
        for (int i = 0; i < size; i++) {
            left[i] = arr[i]; //filling left array with first half of array
        }
        return left;
    }
    public double[] get_right(double[] arr){
        int size = arr.length - arr.length/2; //rest of prices!
        double[] right = new double[size];
        for (int i = 0; i < size; i++) {
            right[i] = arr[arr.length/2 + i]; //filling!
        }
        return right;
    }
    public void merge(double[] arr, double[] left, double[] right){
        int iL = 0, iR = 0; //index left and index right for the sides of the array
        for (int i = 0; i < arr.length; i++) {
            if(iL==left.length){ //making sure there are still remaining things in the left array
                arr[i]=right[iR++];
            }
            else if(iR==right.length){ //same for right
                arr[i]=left[iL++];
            }
            else if(left[iL]>right[iR]){ //comparing items in array for next price in order
                arr[i]=right[iR++];
            }
            else{
                arr[i]=left[iL++]; //if less or equal to! Last case can be else.
            }
        }
    }
}
import java.util.*;
public class FastMergeSort {
    public void sort(double[] arr){
        ArrayList<Integer> iSorts = new ArrayList<Integer>();
        findSorted(arr, iSorts);
        double[] sorted = new double[0];
        for (int i = 0; i < iSorts.size(); i+=2) {
            double[] arrRight = Arrays.copyOfRange(arr,iSorts.get(i),iSorts.get(i+1)+1); //creating subarrays of the sorted regions
            sorted = merge(sorted,arrRight); //merging full array with littler arrays
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sorted[i];
        }
    }
    public void findSorted(double[] arr, ArrayList<Integer> iSorts) {
        iSorts.add(0);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                iSorts.add(i);
                iSorts.add(i + 1);
            }
        }
        iSorts.add(arr.length - 1);
    }
    public double[] merge(double[] left, double[] right){
        double[] temp = new double[left.length + right.length];
        int iL = 0, iR = 0; //index left and index right for the sides of the array
        for (int i = 0; i < temp.length; i++) {
            if(iL==left.length){ //making sure there are still remaining things in the left array
                temp[i]=right[iR++];
            }
            else if(iR==right.length){ //same for right
                temp[i]=left[iL++];
            }
            else if(left[iL]>right[iR]){ //comparing items in array for next price in order
                temp[i]=right[iR++];
            }
            else{
                temp[i]=left[iL++]; //if less or equal to! Last case can be else.
            }
        }
        return temp;
    }
}
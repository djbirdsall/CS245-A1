import java.util.*;
import java.lang.*;
public class MyClass {
    public static void main(String args[]) {
        MyClass j = new MyClass();
        j.testArrays();
    }
    public void testArrays(){
        Random rand = new Random();
        MergeSort m = new MergeSort();
        QuickSort q = new QuickSort();
        SelectionSort s = new SelectionSort();
        BubbleSort b = new BubbleSort();
        FastMergeSort fm = new FastMergeSort();
        InsertionSort is = new InsertionSort();
        for (int i = 0; i < 10; i++) { //filling copies of arrays for each sorting algorithm
            int tester = 50000+i*50000;
            double[] merge = new double[tester];
            double[] quick = new double[tester];
            double[] select = new double[tester];
            double[] bubble = new double[tester];
            double[] insert = new double[tester];
            double[] fmerge = new double[tester];
            for (int j = 0; j < merge.length; j++) {
                double value = rand.nextDouble()*10000;
                merge[j] = value;
                quick[j] = value;
                select[j] = value;
                bubble[j] = value;
                insert[j] = value;
                fmerge[j] = value;
            }
            long time = System.currentTimeMillis();
            m.sort(merge); //sort, print, repeat
            System.out.println("Run time of Merge Sort: "+(System.currentTimeMillis()-time));
            time = System.currentTimeMillis();
            fm.sort(fmerge);
            System.out.println("Run time of Fast Merge Sort: "+(System.currentTimeMillis()-time));
            time = System.currentTimeMillis();
            q.sort(quick);
            System.out.println("Run time of Quicksort: "+(System.currentTimeMillis()-time));
            time = System.currentTimeMillis();
            s.sort(select);
            System.out.println("Run time of Selection Sort: "+(System.currentTimeMillis()-time));
            time = System.currentTimeMillis();
            b.sort(bubble);
            System.out.println("Run time of Bubble Sort: "+(System.currentTimeMillis()-time));
            time = System.currentTimeMillis();
            is.sort(insert);
            System.out.println("Run time of Insertion Sort: "+(System.currentTimeMillis()-time));
            if(Arrays.equals(merge,quick)==false) {
                System.out.println("Error in sorting with Quicksort");
                break;
            }
            if(Arrays.equals(merge,select)==false) {
                System.out.println("Error in sorting with Select");
                break;
            }
            if(Arrays.equals(merge,bubble)==false) {
                System.out.println("Error in sorting with Bubble");
                break;
            }
            if(Arrays.equals(merge,insert)==false) {
                System.out.println("Error in sorting with Insert");
                break;
            }
            if(Arrays.equals(merge,fmerge)==false){
                System.out.println("Error in sorting with Fast Merge");
                for (int j = 0; j < fmerge.length; j++) {
                    System.out.print(fmerge[j]+" ");
                }
                break;
            }
        }
    }
}
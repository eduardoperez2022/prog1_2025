package demo_bubblesort;

import java.util.Arrays;

public class Demo_bubbleSort {


    public static void main(String[] args) {
        int arr[] = {8, 7, 1, 2, 5};
        int arr1[] = {8, 7, 1, 2, 5};

        BubbleSortExample bub = new BubbleSortExample();
        
        System.out.println("Array arr antes de aplicar Bubble Sort");
        //  we use java.util.Arrays toString method to print the array
        System.out.println(Arrays.toString(arr));

        System.out.println("Array arr despues de aplicar Bubble Sort");
        System.out.println(Arrays.toString(bub.bubbleSort(arr)));

        System.out.println("Array arr1 antes de aplicar Bubble Sort");
        System.out.println(Arrays.toString(arr1));

        System.out.println("Array arr1 despues de aplicar Optimized Bubble Sort");
        System.out.println(Arrays.toString(bub.optimizedBubbleSort(arr1)));
    }

}

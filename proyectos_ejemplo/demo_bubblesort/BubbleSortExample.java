package demo_bubblesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortExample {

    
    //  Plane Bubble sort example
    public  int[] bubbleSort(int[] myArray) {

        int temp = 0;  //  temporary element for swapping
        int counter = 0;  //  element to count quantity of steps

        for (int i = 0; i < myArray.length; i++) {
            counter = i + 1;
            for (int j = 1; j < (myArray.length - i); j++) {

                if (myArray[j - 1] > myArray[j]) {
                    
                    //  swap array’s elements using temporary element
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
                
                System.out.println("compara: " + myArray[j - 1] + " :: " + myArray[j] + " :: " + Arrays.toString(myArray)  );
                
            }
        }
        System.out.println("Cantidad de pasos, sin optimizar = " + counter);
        return myArray;
    }
    
    
    //  An optimized version of Java Bubble Sorting
    public int[] optimizedBubbleSort(int myArray[]) {
        int temp;
        boolean swapped;
        int counter = 0;  //  element to count quantity of steps
        for (int i = 0; i < myArray.length - 1; i++) {
            counter = i + 1;
            swapped = false;
            for (int j = 0; j < myArray.length - i - 1; j++) {
                //  counter++;
                if (myArray[j] > myArray[j + 1]) {
                    //  swap arr[j] and arr[j+1]
                    temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                    swapped = true;

                }
            }  //  counter = i;
            
            //  If there weren't elements to swap in inner loop, then break
            if (swapped == false) {
                break;
            }
            
        }
        System.out.println("Cantidad de pasos, optimizado = " + counter);
        return myArray;
    }

}

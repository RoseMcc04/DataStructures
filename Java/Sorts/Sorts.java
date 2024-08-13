package Java.Sorts;

import java.util.Arrays;

/**
 * @author Rose McCormack
 * @version 2024
 */
public class Sorts 
{
    /**
     * @param arr Array of the items
     * @param i1 Index of first item
     * @param i2 Index of second item
     * @description This method swaps two elements of an array based on the 
     * index inputs. We make sure we perform this method on the correct array
     * by also having the original array as a parameter. 
     */
    public void swap(int[] arr, int i1, int i2) 
    {
        int temp = arr[i2];
        arr[i2] = arr[i1];
        arr[i1] = temp;
    }

    /**
     * @param arr Unsorted array inputted
     * @return Returns a sorted array
     * @description The inputted array (unsorted) will be sorted with a 
     * quadratic sort, and then will be returned as a sorted array.
     * @TimeComplexity O(n^2)
     * @SpaceComplexity O(1) 
     */
    public int[] bubbleSort(int[] arr) 
    {
        // Condition for when swapping of elements happens
        boolean swapping = true;
        while (swapping) 
        {
            // Terminal condition to eventually stop the loop
            swapping = false;
            // We look up to arr.length - 1 since we compare index i to index
            // i + 1
            for (int i = 0; i < arr.length - 1; i++) 
            {
                // Looking at if left element is greater than right
                if (arr[i] > arr[i + 1]) 
                {
                    // Swaps the elements
                    swap(arr, i, i + 1);
                    swapping = true;
                }
            }
        }
        return arr;
    }

    /**
     * @param left Left array input to be merged
     * @param right Right array input to be merged
     * @return Returns an array of both inputs combined
     * @description This method allows us to input two halves of an array 
     * and return them as one singular array. 
     */
    public int[] merge(int[] left, int[] right) 
    {
        // Create new array
        int[] merged = new int[left.length + right.length];
        int leftPos = 0;
        int rightPos = 0;
        int cursor = 0;
        // Iterates while both arrays have indeces less than their length
        while (leftPos < left.length && rightPos < right.length) 
        {
            // Simultaneously iterates through elements of both left and right 
            // arrays
            if (left[leftPos] < right[rightPos]) 
            {
                // Earlier position in array assigned
                merged[cursor] = left[leftPos];
                leftPos++;
            }
            else 
            {
                // Earlier position in array assigned
                merged[cursor] = right[rightPos];
                rightPos++;
            }
            cursor++;
        }
        // Copies both left and right arrays into the merged array
        System.arraycopy(left, leftPos, merged, cursor, left.length - leftPos);
        System.arraycopy(right, rightPos, merged, cursor, right.length - rightPos);
        return merged;
    }

    /**
     * @param arr Array input that will be sorted
     * @return Returns sorted Array after merge sort
     * @description This method allows for the input of an array and merge 
     * sort will be performed with the return of the newly sorted array. 
     * @TimeComplexity O(n*log(n))
     * @SpaceComplexity O(n)
     */
    public int[] mergeSort(int[] arr) 
    {
        if (arr.length <= 1) 
        {
            return arr;
        }
        int mid = Math.floorDiv(arr.length, 2);
        // Creating left and right arrays
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        // Recursive call to divide up arrays more and sort them, then they 
        // will merge due to the merge() method
        return merge(mergeSort(left), mergeSort(right));
    }

    /**
     * @param arr Array desired to be worked on
     * @param leftPointer Left position to start at
     * @param rightPointer Right position to start at
     * @return Returns an integer value
     * @description This method paritions the inputted array and uses the 
     * left and right pointers to look up a pivot value. It iterates through
     * the selected range and determines the pointer values based on iterating
     * toward the pivot position. 
     */
    public int partition(int[] arr, int leftPointer, int rightPointer) 
    {
        int pivot = arr[Math.floorDiv(leftPointer + rightPointer, 2)];
        while (leftPointer > rightPointer) 
        {
            while (arr[leftPointer] < pivot) 
            {
                leftPointer++;
            }
            while (arr[rightPointer] > pivot) 
            {
                rightPointer--;
            }
            if (leftPointer < rightPointer) 
            {
                swap(arr, leftPointer, rightPointer);
            }
        }
        return leftPointer;
    }

    /**
     * @param arr Array to be sorted
     * @param start Starting index of desired sort
     * @param end Ending index of desired sort
     * @return Returns sorted array from QuickSort
     * @description This method inputs an array and then sorts it using teh 
     * Quick Sort algorithm. 
     * @TimeComplexity-BestCase O(n*log(n))
     * @TimeComplexity-WorstCase O(n^2)
     * @SpaceComplexity-BestCase O(1)
     * @SpaceComplexity-AverageCase O(log(n))
     * @SpaceComplexity-WorstCase O(n)
     */
    public int[] quickSort(int[] arr, int start, int end) 
    {
        if (end > start) 
        {
            int partition = partition(arr, start, end);
            if (start < partition) 
            {
                quickSort(arr, start, partition);
            }
            if (partition + 1 < end) 
            {
                quickSort(arr, partition + 1, end);
            }
        }
        return arr;
    }
}

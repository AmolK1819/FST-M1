//sort the array in ascending order
//Display the array before and after sorting.

package Activities;

import java.util.Arrays;

class Activity4 {
    static void ascendingSort(int array[]) {
        int size = array.length, i;

        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        System.out.println("Array before sort");
        System.out.print(Arrays.toString(data));
        System.out.println("==============");

        ascendingSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.print(Arrays.toString(data));
    }
}

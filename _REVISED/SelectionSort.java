package _REVISED;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 12, 87, 0, 41, 63
        };
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
        int max_index = 0;
        for (int i = 0; i < arr.length; i++) {
            max_index = arr.length - 1 - i;
            int max_ele_index = getMax_Element(arr, max_index);
            swap(arr, max_index, max_ele_index);
        }

    }

    static int getMax_Element(int[] arr, int max_index) {
        int max_ele_index = 0;
        for (int i = 0; i < max_index; i++) {
            if (arr[max_ele_index] < arr[i]) {
                max_ele_index = i;
            }
        }
        return max_ele_index;
    }

    static void swap(int[] arr, int max_index, int max_ele_index) {
        int tempp = arr[max_index];
        arr[max_index] = arr[max_ele_index];
        arr[max_ele_index] = tempp;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author pushg
 */
public class QuickSort {

    public QuickSort() {
    }

    public int getMiddle(Integer[] list, int low, int high) {
        int tmp = list[low];
        while (low < high) {
            while (low < high && list[high] >= tmp) {
                high--;
            }
            list[low] = list[high];
            while (low < high && list[low] <= tmp) {
                low++;
            }
            list[high] = list[low];
        }
        list[low] = tmp;
        return low;
    }

    public void _quickSort(Integer[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            _quickSort(list, low, middle - 1);
            _quickSort(list, middle + 1, high);  
        }
    }

    public void quick(Integer[] str) {
        if (str.length > 0) {
            _quickSort(str, 0, str.length - 1);
        }
    }
}

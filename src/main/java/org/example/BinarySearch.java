package org.example;



public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 6;
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("result found at " + index);
        } else {
            System.out.println("Target not found");
        }
    }


    public static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] == target) {
                return middle;

            }
            if (arr[middle] < target) {
                left = middle + 1;

            }
            if (arr[middle] > target) {
                right = middle - 1;

            }
        }
        return -1;
    }

}



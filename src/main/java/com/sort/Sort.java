package com.sort;

public class Sort {


    public static void main(String []s){

        int[] arr = {12,1,32,4,2,22,87};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length-1; i++) {

            System.out.println(arr[i]);
        }
    }

    public static int Partition(int[] arr, int low ,int high){

        int pivot = arr[low];
        while(low < high){

            while(low < high && arr[high] >= pivot) -- high;
            arr[low] = arr[high];
            while(low < high && arr[low] <= pivot) ++low;
            arr[high] = arr[low];
        }

        arr[low] = pivot;
        return low;
    }

    public static void quickSort(int[] arr,int low,int high){

        if(low < high){

            int pivot = Partition(arr, low ,high);
            quickSort(arr, low , pivot-1);
            quickSort(arr, pivot+1,high);
        }
    }
}

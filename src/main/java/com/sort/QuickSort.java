package com.sort;

import java.util.List;

public class QuickSort {

    public static void main(String []s){

        int[] arr = {12,1,32,4,2,22,87};
        quciSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length-1; i++) {

            System.out.println(arr[i]);
        }
    }


    public static void quciSort(int[] arr, int low, int high){

        if(low < high){

            int pivot = Partition(arr,low,high);
            quciSort(arr,low,pivot-1);
            quciSort(arr,pivot+1,high);
        }
    }

    private static int Partition(int[] arr , int low ,int high){

        int povit = arr[low];

        while(low < high){

            while(low < high && arr[high] >= povit) --high;
            arr[low] = arr[high];
            while(low < high && arr[low] <= povit) ++low;
            arr[high] = arr[low];
        }

        arr[low] = povit;

        return low;
    }
}

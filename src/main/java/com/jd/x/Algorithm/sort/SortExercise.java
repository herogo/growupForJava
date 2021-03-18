package com.jd.x.Algorithm.sort;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2020/6/9
 * Time: 9:56
 * Description: com.jd.x.Algorithm.sort
 * To change this template use File | Settings | File Templates.
 */
public  class  SortExercise {

    /*
     * 快排
     */
    public static void quickSort(int[] arr,int leftIndex,int rightIndex){
        if (leftIndex >= rightIndex) {
            return;
        }
        int left = leftIndex;
        int right = rightIndex;
        //待排序的第一个元素作为基准值
        int key = arr[left];
        //从左右两边交替扫描，直到left = right
        while (left < right) {
            while (right > left && arr[right] >= key) {
                //从右往左扫描，找到第一个比基准值小的元素
                right--;
            }
            //找到这种元素将arr[right]放入arr[left]中
            arr[left] = arr[right];
            while (left < right && arr[left] <= key) {
                //从左往右扫描，找到第一个比基准值大的元素
                left++;
            }
            //找到这种元素将arr[left]放入arr[right]中
            arr[right] = arr[left];
        }
        //基准值归位
        arr[left] = key;
        quickSort(arr, leftIndex, left - 1);
        quickSort(arr, right + 1, rightIndex);
    }


    /**
     * 冒泡
     */
    public static void popSort(int[] R){

        for(int i=R.length-1; i>=0; i--){

            for(int j=1;j<=i;j++)
            {
                if(R[j-1]>R[j])
                {
                    int temp=R[j];
                    R[j] =R[j-1];
                    R[j-1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] R = new int[]{1,3,2,5,9,4,5,6,2};
        SortExercise.quickSort(R,0,8);
        for (int k=0;k<R.length;k++){
            System.out.print(R[k]+",");
        }

        SortExercise.popSort(R);
        for (int k=0;k<R.length;k++){
            System.out.print(R[k]+",");
        }
    }

}

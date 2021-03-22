package com.jd.x.Algorithm.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

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

    /**
     * 插入排序	//插入排序： 直接插入排序， 希尔排序
     */
    public static void insertSort(int[] sorted){
        int length = sorted.length;
        for(int i=2; i<length; i++){  //数组的第0个下标没有放数据，从第二个数据开始
            if(sorted[i] < sorted[i-1]){
                sorted[0] = sorted[i];   //设置哨兵
                sorted[i] = sorted[i-1]; //将数据前面那个数据后移一位
                int insert = 0;
                for(int j=i-2; j>=0; j--){
                    if(sorted[j] > sorted[0]){
                        sorted[j+1] = sorted[j];  //后移一位
                    }else{
                        insert = j+1;  //插入的位置
                        break;
                    }
                }
                sorted[insert] = sorted[0];
            }
        }
    }


    /**
     * quickSort
     * @param sorted
     */
     public static void quickSort1(int [] sorted ,int leftIndex ,int rightIndex){
         //System.out.printf("sort:长度:"+sorted.length);
         if(leftIndex > rightIndex){
             return;
         }
         int left = leftIndex;
         int right = rightIndex;
      int key = sorted[left];
      while(left < right){
          while(left < right && key <= sorted[right])
              right --;
          sorted[left] = sorted[right];
          while(left < right && sorted[left] <=key)
              left ++;
          sorted[right] = sorted[left];
      }
      sorted[left] = key;
      quickSort1(sorted,0,left-1);
      System.out.println("rightIndex:"+rightIndex);
      quickSort1(sorted,left+1,rightIndex);
     }

    public static void so(int[] sorted){
        int temp;//暂存
     for(int i=1;i<sorted.length;i++){
         if(sorted[i]<sorted[i-1]){
             temp = sorted[i];
             sorted[i] = sorted[i-1];//前面的后移
             for(int j=i-1;j>=0;j--){
                 if(temp < sorted[j]){
                      sorted[j+1] = sorted[j];//往后移
                 }else {
                     sorted[j+1] =temp;
                     break;
                 }

             }
         }
     }
    }

    /**
     * 简单选择排序
     */
    public static void selectSort(int [] sorted){
         for(int i=0;i<sorted.length-1;i++){
             //每一次循环中找出最小的
             int min = i;
             for(int j=i+1;j<sorted.length;j++){
                 if(sorted[min] > sorted[j]){
                     min=j;
                 }
             }
             int temp = sorted[min];
             sorted[min] = sorted[i];
             sorted[i] = temp;

         }

    }


    /**
     * 堆排序
     * @param sorted
     */

    public static void heapSort(int [] sorted){
        //1.构建大顶堆
        for(int i=sorted.length/2-1; i>=0;i--){ // i 为最小的非叶子节点
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(sorted,i,sorted.length);
        }

        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=sorted.length-1;j>0;j--){
            swap(sorted,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(sorted,0,j);//重新对堆进行调整
        }
    }

    public static void heapSort1(int []arr){
        //1.构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap1(arr,i,arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap1(arr,0,j);//重新对堆进行调整
        }

    }

    public static void adjustHeap1(int []arr,int i,int length){
        int temp = arr[i];//先取出当前元素i
        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
            if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if(arr[k] >temp){//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }
    //构建大根堆
    public static void adjustHeap(int [] R,int i,int length){
        int temp = R[i]; //暂存第一个从下到上的非叶子节点
        //找出该子树中最大值 并交换位置
        for(int k = i * 2 +1; k<length; k = k*2+1){
           if(k+1 < length && R[k] <R[k+1]){//k+1 为 右子树 左子树小于右子树
               k++;
           }
           if(R[k] >temp){//父节点小于子节点 交换
               R[i] = R[k];
               i = k;
           }
        }
        R[i] = temp;//交换至原位
    }

    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void main(String[] args) {
        int[] R = new int[]{6,7,1,3,2,5,9,4,5,8,2};
        SortExercise.quickSort1(R,0,R.length-1);
        System.out.print("快速排序:");
        for (int k=0;k<R.length;k++){
            System.out.print(R[k]+",");
        }

        SortExercise.popSort(R);
        System.out.print("\n"+"冒泡排序:");
        for (int k=0;k<R.length;k++){
            System.out.print(R[k]+",");
        }

        SortExercise.so(R);
        System.out.print("\n"+"插入排序:");
        for (int k=0;k<R.length;k++){
            System.out.print(R[k]+",");
        }

        SortExercise.selectSort(R);
        System.out.print("\n"+"简单选择排序:");
        for (int k=0;k<R.length;k++){
            System.out.print(R[k]+",");
        }

        SortExercise.heapSort(R);
        System.out.print("\n"+"堆排序:");
        for (int k=0;k<R.length;k++){
            System.out.print(R[k]+",");
        }

//        Random random = new Random(6);
//        int arraySize = 100000;
//        int[] sorted = new int[arraySize];
//
//        //System.out.println("排序前:");
//        for(int i=1;i<arraySize; i++){
//            sorted[i] = (int)(random.nextDouble()*100);
//           // System.out.print((int)sorted[i] + " ");
//        }




    }

}

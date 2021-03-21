package com.jd.x.Algorithm.sort;

public class SearchExercise {

    public static void main(String[] args) {
        int[] R = new int[]{6,7,1,3,2,5,9,4,5,8,2};
        int pos = SearchExercise.search(R, 5);
        System.out.println(pos == -1 ? "no result!" :"index->"+pos);
    }

    /**
     * 顺序查找
     * @param R
     * @param key
     */
    public static int search(int [] R,int key){
        int pos=-1;
        for(int i=0;i<R.length;i++){
             if(key==R[i])
                 pos =i;
        }
        return pos;
    }

    /**
     * 折半  前提有序
     * @param R
     * @param key
     * @return
     */
    public static int binarySearch(int [] R,int key){
        int pos = -1;
        int left =0;
        int right = R.length-1;
        while (left < right){
            int mid = (right-left)/2;
            if(R[mid] == key)
                pos = mid;
            if(R[mid]>key)
                right = mid-1;
            else
                left = mid +1;
        }
        return pos;
    }



}

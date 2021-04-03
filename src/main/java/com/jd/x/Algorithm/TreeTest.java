package com.jd.x.Algorithm;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2020/6/8
 * Time: 17:44
 * Description: com.jd.x.Alogryhm
 * To change this template use File | Settings | File Templates.
 */
public class TreeTest {
    public static void main(String[] args) {
        BinaryTree binTree = new BinaryTree();
        binTree.layerTranverse();

        System.out.println(Math.log(200) / Math.log(1.02) / 12);
    }

    public void quickSort(int []Array,int left,int right){
        int i=left,j=right;
        int keyword = Array[i];
        while(i!=j){
            while(i<j && keyword<= Array[j]){
                j--;
            }
            if(i<j){
                int temp = Array[j];
                Array[i] = Array[j];
                Array[j] = temp;
            }
            while(i<j && Array[i]< keyword){
                i++;
            }
            if(i<j){
                int temp = Array[j];
                Array[i] = Array[j];
                Array[j] = temp;
            }
        }
    }
}

package com.jd.x.Algorithm.arry;

public class Test {

    public static void main(String[] args) {
        int [] R = new int[]{1,3,4,6,8,9};
        solution3(R,10);
    }


    /**
     * 在一个有序数组中 寻找和为10的两个元素，返回索引  [1,3,4,6,8,9]
     * @return
     */
    public static void solution(int [] R,int sum){
        //暴力解法
        for(int i=0;i<R.length-1;i++){
            for(int j =i+1;j<R.length;j++){
                if(R[i]+R[j] ==sum){
                    System.out.println("索引:"+i+","+j);
                }
            }
        }


    }

    public static void solution2(int [] R,int sum){

        //优化解法  利用有序
        for(int i=0;i<R.length-1;i++){
            for(int j =i+1;j<R.length;j++){
                if(R[i]+R[j] >sum)
                    break;
                if(R[i]+R[j] ==sum){
                    System.out.println("索引:"+i+","+j);
                }
            }
        }

    }
    public static void solution3(int [] R,int sum){
        int left =0;
        int right = R.length-1;
        //再优化解法  利用有序  利用两个索引 前后各一个
        /**
         * 当左指针 加上 右指针  >  sun  右指针-- 反之则左指针++
         */
        while(left < right){
            int temp = R[left] + R[right];
            if(temp > sum){
                right--;
            }else if(temp < sum){
                left++;
            }else {
                System.out.println("索引:"+left+","+right);
                left++;
                right--;
            }
        }
    }
}

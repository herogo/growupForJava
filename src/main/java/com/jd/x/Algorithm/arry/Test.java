package com.jd.x.Algorithm.arry;

import scala.Char;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //int [] R = new int[]{1,3,4,6,8,9};  //测试用例1
       // solution1_3(R,10);

      //        String strTest = "abbdkkihslp"; //  测试用例2
      //        solution2_1(new StringBuffer(strTest));

//        int[][] testarray=new int[4][4];
//        testarray[0][0]=1;
//        testarray[0][1]=2;
//        testarray[0][2]=8;
//        testarray[0][3]=9;
//        testarray[1][0]=2;
//        testarray[1][1]=4;
//        testarray[1][2]=9;
//        testarray[1][3]=12;
//        testarray[2][0]=4;
//        testarray[2][1]=7;
//        testarray[2][2]=10;
//        testarray[2][3]=13;
//        testarray[3][0]=6;
//        testarray[3][1]=8;
//        testarray[3][2]=11;
//        testarray[3][3]=15;
//        solution3_1(testarray, 15); //   测试用例3

//
//        String test = "abcdefghjk";//测试用例4
//        solution4_1(test);

//        int [] R = new int[]{2,3,1,2,4,3};
//        System.out.println(solution5_3(R,7));
//        int [] R1 = new int[]{1,4,4};
//        System.out.println(solution5_3(R1,4));
//        int [] R2 = new int[]{1,1,1,1,1,1,1,1};
//        System.out.println(solution5_3(R2,12));
//        int [] R3 = new int[]{1,2,3,4,5};
//        System.out.println(solution5_3(R3,11));
//        int [] R4 = new int[]{1,2,3,4,5};
//        System.out.println(solution5_3(R4,15));

        String re = "aaaaaa";
        String s = "abcabcbb";

//        System.out.println(solution6_1(re));
//        System.out.println(solution6_1(s));
//        System.out.println(solution6_1("pwwkew"));
//        System.out.println(solution6_1(""));

       // System.out.println(isAng("abc","bac"));
        // s: "cbaebabacd" p: "abc"
        //System.out.println(solution7_1("cbaebabacd","abc"));
        System.out.println(solution8_2("cbaebabacd","ab"));

    }


    /**
     * 字符串练习题
     */

    /**试题1
     * 在一个有序数组中 寻找和为10的两个元素，返回索引  [1,3,4,6,8,9]
     * @return
     */
    public static void solution1_1(int [] R,int sum){
        //暴力解法
        for(int i=0;i<R.length-1;i++){
            for(int j =i+1;j<R.length;j++){
                if(R[i]+R[j] ==sum){
                    System.out.println("索引:"+i+","+j);
                }
            }
        }
    }
    public static void solution1_2(int [] R,int sum){
        //优化解法  利用有序
        for(int i=0;i<R.length-1;i++){
            for(int j =i+1;j<R.length;j++){
                if(R[i]+R[j] >sum)//因为有序 可以直接终止继续
                    break;
                if(R[i]+R[j] ==sum){
                    System.out.println("索引:"+i+","+j);
                }
            }
        }
    }
    public static void solution1_3(int [] R,int sum){
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

    /** 试题2  leetcode1047
     * 删除字符串中的所有相邻重复项
     * 输入："abbaca"
     * 输出："ca"
     * 解释：
     * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"
     */
    public static void solution2_1(StringBuffer str){
        System.out.println("输入:"+str);
        //暴力法 滑动窗口
        int l = 0;
        while(l< str.length()-1){
            if(str.charAt(l)==str.charAt(l+1) && l==0){
                      str.deleteCharAt(l);
                      str.deleteCharAt(l);
            }else if(str.charAt(l)==str.charAt(l+1) && l>0){
                str.deleteCharAt(l);
                str.deleteCharAt(l);
                l--;
            }else {
                l++;
            }
        }
        str.toString();
        System.out.println("输出:"+str);
    }

    public static void solution2_2(StringBuffer str){
        System.out.println("输入:"+str);
        //压栈法
        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        System.out.println("输出:"+str);
    }


    /**
     * 试题3  剑指offer 第3题
     * 一个二维数组，每一行从左到右递增，每一列从上到下递增．输入一个二维数组和一个整数，判断数组中是否含有整数。
     * 思路:左-》右，上-》下 递增 从右到左 上到下 便利
     */

    public static void solution3_1(int R[][],int key){
        int column = R[0].length-1;//得到总的列数
        int rowTotal=R.length-1;//得到总行数
        int row=0;
        while(column >= 0 && row <= rowTotal){
            int like = R[row][column]; //从最右上角开始
            if(like == key){
                System.out.println( "R["+row+"]["+column+"]");
                return;
            }else if(like > key){
                column--;
            }else {
                row++;
            }
        }
    }
    /**
     * 试题 4 翻转字符串   输入 input 输出 tupni
     */
    public static void solution4_1(String str){
        char[] chars = str.toCharArray();
        //使用左右指针
        int left =0;
        int right = str.length()-1;

        while(left < right){
            char temp ;
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        StringBuffer output =new StringBuffer();
        for ( char ch:chars) {
            output.append(ch);
        }
        System.out.println("翻转字符串前"+str+"翻转字符串后"+output.toString());
    }

    /**
     * leetcode 209
     * 试题 5  给定一个含有 n 个正整数的数组和一个正整数 target 。
     * 找出该数组中满足其和 = target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
     */

    public static int solution5_1(int R[],int key){
        //暴力法 先找到符合条件 子数组 然后再找出最短的子数组
        int length =R.length;
        boolean flag =false;
        for(int i =0; i<R.length-1;i++){
            if(R[i] == key){
                length = 1;
                return length;
            }
            int j=i+1;
            int temp = R[i]+R[j];
            if(temp == key){
                    length = j-i+1;
                    return length;
            }
            if(temp >key){
                continue;
            }
            while (temp <key && j<R.length-1){
                temp = temp + R[++j];
                if(key == temp){
                    flag =true;
                    if(j-i < length){
                        length = j-i+1;
                    }
                    break;
                }
                if(key<temp){
                    break;
                }
            }
        }
        if(!flag){
            return 0;
        }
        return length;
    }

    public static int compareArr(int arr [],int left,int right){
        int temp =0;
        for(int i=left;i<=right;i++){
            temp +=arr[i];
        }
        return temp;
    }

    public static int solution5_2(int R[], int key) {
        int length =R.length;
        boolean flag = false;
        // 暴力法
        for(int i=0;i<R.length;i++){
            //先判断本身
            if(R[i]>=key){
                return 1;
            }
            int temp =R[i];
            for (int j=i+1;j<R.length;j++){
                //int temp = compareArr(R,i,j);
                temp+=R[j];
                if(temp>=key){
                    flag = true;
                    if(length > j-i+1){
                        length = j-i+1;
                    }
                    break;
                }
            }
        }
        if(!flag){
            return 0;
        }
        return length;
    }


    public static int solution5_3(int R[], int key) {
        //滑动窗口
        boolean flag = false;
        int length =R.length;
        int low =0;
        int high =0;
        int sum=R[low];
        while(low <= high && high<R.length){
            if(sum<key){
                if(high==R.length-1){
                    if(!flag){
                        return 0;
                    }
                    //因为到达右边界 sum还是小于key的话 就不用判断了
                    return length;
                }
                sum += R[++high];
            }
            if(sum >=key){
                flag = true;
                if(length > high-low+1){
                    length = high-low+1;
                }
                sum -=R[low++];
            }
        }
        if(!flag){
            return 0;
        }
        return length;
    }

    /**
     * 试题6 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 leetcode 3
     */
    public static int solution6_1(String str){
        if(str.equals("")){
            return 0;
        }
        int left =0;
        int right =1;
        int lengthMax= 1;
        while(left <= right && right <str.length()){
            if(isRepeat(str.substring(left,right+1))){
              //如果不重复
                if(lengthMax < right-left +1){
                    lengthMax = right-left +1;
                }
                right++;
            }else {
                left++;
            }
        }
        return lengthMax;
    }

    /**
     * 判断有无重复字符串`
     * @param str
     * @return
     */
    public static Boolean isRepeat(String str){
        //初始化一个ASCII码数组
        int fre[] =new int[256];
        for (int i=0;i<fre.length;i++){
            fre[i] =0;
        }
        int i=0;
        while(i<str.length()){
            if(fre[str.charAt(i)] == 0){
                fre[str.charAt(i++)]++;
            }else {
                return false;
            }
        }
        return true;
    }


    /** 试题7
     * leetcode 438  找到字符串中所有字母异位词
     *
     * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
     * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
     * 输入:
     * s: "cbaebabacd" p: "abc"
     *
     * 输出:
     * [0, 6]
     *
     * 解释:
     * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
     * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
     */

    public static List<Integer> solution7_1(String s,String p){
        int i=0;
        int j = p.length()-1;//滑动步长
        List<Integer> result = new ArrayList();
        while (j<s.length()){
            String substring = s.substring(i, j + 1);
            if(isAng(p,substring)){
                result.add(i);
            }
            i++;
            j++;
        }
        return result;
    }

    public static boolean isAng(String s2,String s1){
        //初始化一个ASCII码数组
        int fre[] =new int[256];
        int fre2[] =new int[256];
        for (int i=0;i<fre.length;i++){
            fre[i] =0;
            fre2[i] =0;
        }
        int i=0;
        while (i<s1.length()){
            fre[s1.charAt(i++)]++;
        }
        int j=0;
        while (j<s2.length()){
            fre2[s2.charAt(j++)]++;
        }
        int k=0;
        while (k<s2.length()){
            int temp1 = fre[s1.charAt(k)];
            int temp2 = fre2[s1.charAt(k++)];
            if(temp1 != temp2){
              return false;
            }
        }
       return true;
    }

    /**
     * leetcode 76 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
     * 输入：s = "ADOBECODEBANC", t = "ABC"
     * 输出："BANC"
     *
     * 输入：s = "a", t = "a"
     * 输出："a"
     */
    public static String solution8_1(String s,String t){
        int [] fre = new int[256];
        for (int i=0;i<fre.length;i++){
            fre[i] =0;
        }
        int i=0;
        while (i<t.length()){
            fre[t.charAt(i++)]++;
        }
        int left =0;
        int right=0;
        int length =s.length();
        String result ="";

        while(left<=right && right <s.length()){
            String substring = s.substring(left, right + 1);
            int [] sub = new int[256];
            int k=0;
            while (k<substring.length()){
                sub[substring.charAt(k++)]++;  //没必要每次循环都构建这个窗口字符的出现频率数组  见solution8_2
            }
            if(contain(sub, fre)){
                if(length >= right-left+1){
                    length = right-left+1;
                    result = substring;
                }
                left++;
            }else {
                right++;
            }
        }
        return result;
    }


    public static String solution8_2(String s,String t){
        int [] fre = new int[256];
        for (int i=0;i<fre.length;i++){
            fre[i] =0;
        }
        int i=0;
        while (i<t.length()){
            fre[t.charAt(i++)]++;
        }
        int left =0;
        int right=0;
         int length =s.length();
        String result ="";
        int [] sub = new int[256];
        int k=0;
        String substring = s.substring(left, right + 1);
        sub[substring.charAt(0)]++;  //初始化窗口字符的出现频率数组
        while(left<=right && right <s.length()){
            if(contain(sub, fre)){
                if(length >= right-left+1){
                    length = right-left+1;
                    result = s.substring(left,right+1);
                }
                sub[s.charAt(left++)]--;  //左指针向后移 则减去左指针对应的字符出现的频率
            }else {
                if(++right<s.length()){
                    sub[s.charAt(right)]++;//右指针向后移 则加上右指针对应的字符出现的频率
                }
            }
        }
        return result;
    }
    /**
     *
     * @param r1 主数组
     * @param r2 子数组
     * @return
     */
    public static boolean contain(int [] r1,int [] r2){
        int i=0;
        while(i<r1.length){
            if(r1[i] < r2[i]){
                return false;
            }
            i++;
        }
        return true;
    }





}

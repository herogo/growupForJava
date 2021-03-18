package com.jd.x;

import com.jd.x.jsonTest.JsonHelper;

/**
 * Created by kongpeiling on 2019/4/4 19:40.
 * description:The program for get different words in string
 */

public class Test {
    public static void main(String[] args)
    {

        String s="abdcddafaaaio";
        char[] chars = s.toCharArray();
        char[] num = new char[26];
        int k=0;
        for(int i=0;i<chars.length;i++)
        {
            Boolean flag=false;
            for(int j=0;j<num.length;j++)
            {
                if(chars[i]==num[j])
                {
                    flag=true;
                    break;
                }
            }
            if(!flag){
                num[k] =chars[i];
                k++;
            }
        }
        System.out.println(k);

    }
}

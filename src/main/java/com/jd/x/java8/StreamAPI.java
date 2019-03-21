package com.jd.x.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by kongpeiling on 2018/12/4 15:34.
 */
public class StreamAPI {

    User wangwu = new User(12, "王五");
    User zhaoliu = new User(9, "赵柳");
    User heizi = new User(9, "黑子");
    User heizi2 = new User(1, "黑子");
    User heizi3 = new User(3, "黑子");
    User heizi4 = new User(5, "黑子");
    List<User> list = Arrays.asList(wangwu, zhaoliu,heizi,heizi2,heizi3,heizi4);

    @Test
    public void testStream(){
         list.stream().filter((x) -> x.getName()!="王五")
                      //.limit(1)
                      .forEach(System.out::println);

        list.stream().map((x) -> x.getAge())
                                    .sorted()
                                    .collect(toList())
                .forEach(System.out::println);


        Stream<User> sorted = list.stream().map((x) -> x)
                .sorted((x, y) -> {
                    if (x.getAge().equals(y.getAge())) {
                        return x.getName().compareTo(y.getName());
                    } else {
                        return x.getAge().compareTo(y.getAge());
                    }
                });
        System.out.println("+++++++++++++++++++++++++++++++++");
        Double collect = list.stream()
                .collect(Collectors.averagingDouble(x -> x.getAge()));

    }

    @Test
    public void testStream2(){
        List<Integer> lista = Arrays.asList(1,2);
        List<Integer> listb = Arrays.asList(3,4,5);

        List<int[]> collect = lista.stream()
                .flatMap(x -> listb.stream()
                        .filter(y->(x+y)%3==0)
                        .map(y -> new int[]{x, y}))
                .collect(Collectors.toList());
        for ( int [] u:collect) {
            System.out.println(Arrays.toString(u));
        }
        System.out.println("+++++++++++++++++++++++++++++++++");
        Integer [] a={1,2};
        System.out.println(Arrays.toString(a));

        System.out.println("+++++++++++++++++++++++++++++++++");
        Integer sum=lista.stream().reduce(1,(x,y)->x*y);

        System.out.println("+++++++++++++++++++++++++++++++++");
        int i = Runtime.getRuntime().availableProcessors();//获取处理器数量
        System.out.print(i);
    }



}

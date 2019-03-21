package com.jd.x.java8;
import org.junit.Test;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by kongpeiling on 2018/11/29 10:57.
 */

public class lambdaExpression {
    User wangwu = new User(12, "王五");
    User zhaoliu = new User(9, "赵柳");
    List<User> list = Arrays.asList(wangwu, zhaoliu);

    public List filterEmployee(List<User> users, MyStragey<User> myStragey) {
        List list1 = new ArrayList();
        for (User user : users) {
            if (myStragey.test(user))
                list1.add(user);
        }
        return list1;
    }
    public int filter(int x,int y,MyAdd myAdd){
       return  myAdd.add(x,y);
    }
    @Test
    //lambda
    public void testLambda() {
        //List result = filterEmployee(list, e -> e.getAge() < 10);
        //System.out.println(result.toString());
        MyStragey<User> myStragey = x -> x.getAge() > 10; //有参数有返回值
        System.out.println(myStragey.test(wangwu));
        Mytest mytest = () -> System.out.println("京东！"); //无参数无返回值
        mytest.test();
        MyAdd myAdd = (x, y) -> x * y;
        System.out.println(myAdd.add(3,4));
        System.out.println(filter(3,4,(x,y)->x*y*100));

        Consumer con = System.out::println;
        con.accept("kongpeiling");

        Comparator<Integer> com=Integer::compare;

    }
}

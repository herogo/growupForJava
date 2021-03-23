package com.jd.x.Algorithm.stack;

import com.jd.x.jsonTest.JsonHelper;

import java.util.Deque;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        MyQueue myQueue =new MyQueue();
        int[] R = new int[]{1,2};
        int i=0;
        while(i<R.length){
            myQueue.push(R[i]);
            i++;
        }
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
    }
}
    /**
     * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
     *
     * 实现 MyQueue 类：
     *
     *     void push(int x) 将元素 x 推到队列的末尾
     *     int pop() 从队列的开头移除并返回元素
     *     int peek() 返回队列开头的元素
     *     boolean empty() 如果队列为空，返回 true ；否则，返回 false
     */
     class MyQueue{
        Stack<Integer> inStack = new Stack();
        Stack<Integer> outStack = new Stack();
        void push(int x){
            while (outStack.size()>0){
                inStack.push(outStack.pop());
            }
             inStack.push(x);
        }
        int pop(){
            init();
            return  outStack.pop();
        }
        int peek(){
            init();
            return outStack.peek();
        }
        boolean empty(){
            init();
            return outStack.empty();
        }
        void init(){
            while (inStack.size()>0)
                outStack.push(inStack.pop());
        }
    }

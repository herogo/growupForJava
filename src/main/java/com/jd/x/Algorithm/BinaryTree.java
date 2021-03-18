package com.jd.x.Algorithm;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Author: kongpeiling
 * Date: 2020/6/8
 * Time: 18:14
 * Description: com.jd.x.Alogryhm
 * To change this template use File | Settings | File Templates.
 */
class BinaryTree {
    private Node root;
    public BinaryTree(){
        root=null;
    }
    //将data数据插入到排序的二叉树中
    public void insert(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
        }else{
            Node current=root;
            Node parent;
            while(true){
                parent=current;
                if(data<current.data){
                    current=current.left;
                    if(current==null){
                        parent.left=newNode;
                        return;
                    }
                }else{
                    current=current.right;
                    if(current==null){
                        parent.right=newNode;
                        return;
                    }
                }
            }

        }
    }
    public void initTree(int[] data){
        for(int i=0;i<data.length;i++){
            insert(data[i]);
        }
    }
    public void layerTranverse(){
        Stack evenStack = new Stack();
        Stack oddStack = new Stack();
        if(this.root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(this.root);
        int i = queue.size();
        int layer =1;
        List<Node> layerNodes = new ArrayList<>();
        while(!queue.isEmpty()){
            Node n=queue.poll();
            while(i==0){
                i=layerNodes.size();
                if(layer % 2 ==0){
                    while (!evenStack.empty()){
                        System.out.print(evenStack.pop()+",");
                    }
                }else {
                    while (!oddStack.empty()){
                        System.out.print(oddStack.pop()+",");
                    }
                }
                layer++;
                layerNodes = new ArrayList<>();
            }
            i--;
            if(layer % 2 ==0){
                evenStack.push(n.data);
            }else {
                oddStack.push(n.data);
            }
            if(n.left!=null){
                queue.add(n.left);
                layerNodes.add(n.left);
            }
            if(n.right!=null){
                queue.add(n.right);
                layerNodes.add(n.right);
            }
        }
    }
}
class Node{
    public int data;
    public Node left;
    public Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
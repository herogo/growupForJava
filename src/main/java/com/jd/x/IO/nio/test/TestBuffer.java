package com.jd.x.IO.nio.test;

import org.junit.Test;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestBuffer {
	
	public static void main(String[] args) {

		List<String > list =new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");

		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println(list.toString());

	}
}

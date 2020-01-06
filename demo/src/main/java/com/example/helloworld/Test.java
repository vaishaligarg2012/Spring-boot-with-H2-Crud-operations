package com.example.helloworld;

import java.util.*;

public class Test {
	static String o = "";

	public static void main1(String[] args) {
		List a = new ArrayList<>();
		a.add("one");
		List ab = new ArrayList<>();
		ab.add("one");
		System.out.println(a.equals(ab));//true
	}

	public static void main2(String[] args) {
		z: {
			o = o + 2;
			for (int x = 3; x < 8; x++) {
				if (x == 4)
					break;
				if (x == 6)
					break z;
				o = o + x;
			}
			System.out.println(o);//23

		}
	}

	public static Iterator reverse(List list) {
		Collections.reverse(list);
		return list.iterator();

	}

	public static void main3(String[] args) {
		List a = new ArrayList<>();
		a.add("1");
		a.add("2");
		a.add("3");
		System.out.println(reverse(a));
	//reverse(a).forEachRemaining(it->it.);
		 

	}
}

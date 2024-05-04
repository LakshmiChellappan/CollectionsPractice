package com.linkedlist.practice;

import java.util.LinkedList;

public class LinkedListMethodsPractice {

	public static void main(String[] args) {
		LinkedList<String> names=new LinkedList<>();
		names.add("Venba");
		names.add("nadhi");
		names.add("Aaradhya");
		names.add("Anbu");
		names.add("Haeshika");
		System.out.println(names);
		names.add(0,"Lakshmi");
		System.out.println(names);
		names.set(0, "Madan");
		System.out.println(names);

	}

}

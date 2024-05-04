package com.stack.practice;

import java.util.Stack;

public class StackMethodsPractice {

	public static void main(String[] args) {
		Stack<Integer> numbers=new Stack<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers.isEmpty());
		System.out.println(numbers);
		System.out.println(numbers.peek());
		System.out.println(numbers.pop());
		System.out.println(numbers);
		System.out.println(numbers.push(6));
		System.out.println(numbers);
		System.out.println(numbers.search(1));
		
		
	}

}

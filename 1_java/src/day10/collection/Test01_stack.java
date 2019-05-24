package day10.collection;

import java.util.Stack;

public class Test01_stack {
	public static void main(String[] args) {
		
		//<E>배열의타입을어떻게할래? , 항상casting, 지네릭스(generics)<?>
		Stack<String> stack = new Stack<String>();
		
		stack.push("aaaa");
		stack.push("bbbb");
		stack.push("cccc");

		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
//		System.out.println(stack.pop());
		
	}
}

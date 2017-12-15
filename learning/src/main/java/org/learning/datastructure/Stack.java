package org.learning.datastructure;

public class Stack {
	
	public static void main(String... a) {
		stackImp stack=new stackImp();
		stack.push(10);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(20);
		stack.push(100);
		for(int values:stack.stack) {
			System.out.print(values+" ");
		}
		System.out.println();
		System.out.println(stack.pop());
		for(int values:stack.stack) {
			System.out.print(values+" ");
		}
		System.out.println();
		int b=0;
		System.out.println(++b);
		
	}
}


class stackImp{

	int top=0;
	int[] stack=new int[10];
	
	public void push(int value) {
		if(top > (stack.length-1)) {
			System.out.println("Stack is full");
		}else {
			stack[top]=value;
			++top;
		}
	}
	
	public int pop() {
		if(top <=0) {
			System.out.println("Stack is empty");
			return 0;
		}
		top=--top;
		int value=stack[top];
		stack[top]=0;
		return value;
		
	}
	
}

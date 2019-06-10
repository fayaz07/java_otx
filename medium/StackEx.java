package medium;

import java.util.Stack;

public class StackEx {

	static Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args){
		push();
	}
	
	static void push() {
		stack.push(10);
		push();
	}
}

package StacksAndQueues;

import java.util.HashMap;
import java.util.Stack;

public class matchingParan {

	public static boolean isParanMatching(String str) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '['
					|| str.charAt(i) == '(')
				stack.push(str.charAt(i));
			else {
				if (stack.isEmpty() || stack.pop() != map.get(str.charAt(i))) return false;
				}

		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isParanMatching("{}}") ? true : false);
	}
}

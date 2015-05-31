package StacksAndQueues;

import java.util.HashMap;
import java.util.Stack;

public class matchingParan {
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		braces("}}}}");
//	}
	
//
//	private static void braces(String code) {
//		Stack stack = new Stack();
//		for (char ch: code.toCharArray()) {
//			if ('}' == ch || ']' == ch || ')' == ch) {
//				if (stack.empty()) {
//					System.out.println("NO");
//					return;
//				} else {
//					char prev = (Character) stack.pop();
//					if ((ch == '}' && prev == '{') || (ch == ']' && prev == '[') || (ch == ')' && prev == '(')) {
//					} else {
//						System.out.println("NO");
//						return;
//					}
//				}
//			}
//			else if ('{' == ch || '[' == ch || '(' == ch)
//				stack.push(ch);
//
//			else {
//				System.out.println("NO");
//				return;
//			}
//		}
//		System.out.println(stack.empty() ? "YES" : "NO");
//	}
//
//
//
//
//}
	
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

		if (isParanMatching("}}}}}}}}") != true) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}


/*

public class matchingParan {

	  public static boolean isParanMatching(String str){

		

		char rightParen = '}';

		char rightBrackets = ')';

		char rightSqrBrackets = ']';

		char leftParen = '{';

		char leftBrackets = '(';

		char leftSqrBrackets = '[';

		  	  

		

		

		  Stack<Character> stack = new Stack<Character>();

		  for(int i=0;i<str.length();i++){

			

			  if(str.charAt(i)==leftParen) stack.push(leftParen);

			  else if(str.charAt(i)==leftBrackets) stack.push(leftBrackets);

			  else if(str.charAt(i)==leftSqrBrackets) stack.push(leftSqrBrackets);

		  

			  else if(str.charAt(i)==rightParen) {

				  if(stack.isEmpty()) return false;

				  if (stack.pop()!=leftParen)return false;

			  }

			  else if (str.charAt(i)==rightBrackets){

				  if(stack.isEmpty()) return false;

				  if(stack.pop()!=leftBrackets) return false;

			  }

			  

			  	else if (str.charAt(i)==rightSqrBrackets){

				  if(stack.isEmpty()) return false;

				  if(stack.pop()!=leftSqrBrackets) return false;

			  }

			  

		  }

			return stack.isEmpty();

	  }

		

		

		public static void main(String[] args) {

			

			if(isParanMatching("}}}}}}}}")!=true) {System.out.println("No");}

			else{ System.out.println("Yes");}

		}

	}

*/
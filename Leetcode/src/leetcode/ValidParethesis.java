package leetcode;

import java.util.Stack;

public class ValidParethesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isValid("(])"));

	}

	public static boolean isValid(String str) {

		Stack<Character> stack = new Stack<>();

		for (char temp : str.toCharArray()) {

			if (temp == '{' || temp == '(' || temp == '[') {
				stack.push(temp);
			} else if (temp == '}') {
				if (stack.peek() == '{')  {
					stack.pop();
				}  else {
					stack.push(temp);
				}
			} else if (temp == ')') {
				if (stack.peek() == '(')  {
					stack.pop();
				}  else {
					stack.push(temp);
				}
			} else if (temp == ']') {
				if (stack.peek() == '[')  {
					stack.pop();
				} else {
					stack.push(temp);
				}
			}
		}

		return stack.isEmpty();
	}

}

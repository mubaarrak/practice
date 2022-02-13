import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {

		String inputString = "(((())";

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < inputString.toCharArray().length; i++) {

			if (inputString.charAt(i) == '(') {
				stack.add('(');
			} else if (!stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}
		}

		System.out.println(stack.isEmpty());

	}

}

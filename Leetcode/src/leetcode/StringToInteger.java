package leetcode;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(myAtoi("42"));

	}

	public static int myAtoi(String s) {

		s = s.trim();
		
		if (s.length() == 0) {
			return 0;
		}
		

		boolean negativeFlag = s.charAt(0) == '-' ? true : false;
		boolean positiveFlag = s.charAt(0) == '+' ? true : false;

		if (negativeFlag || positiveFlag) {
			s = s.substring(1);
		}

		int ans = 0;

		StringBuilder stringBuilder = new StringBuilder();

		int i = 0;
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			stringBuilder.append(s.charAt(i));
			i++;
		}

		if (stringBuilder.length() >= 1) {
			try {
				ans = Integer.parseInt(stringBuilder.toString());
			} catch (NumberFormatException e) {
				return negativeFlag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}

		}

		return negativeFlag ? -1 * ans : ans;
	}

}

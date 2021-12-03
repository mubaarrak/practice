package leetcode;

public class ReverseInteger {

	public static void main(String[] args) {

		System.out.println(reverse(110));

	}

	public static int reverse(int x) {

		if (x > Integer.MAX_VALUE)
			return 0;

		StringBuilder stringBuilder = new StringBuilder(Integer.toString(x));

		if (stringBuilder.charAt(0) == '-') {
			stringBuilder.deleteCharAt(0);
		}

		int n = 0;

		try {
			n = Integer.signum(x) * Integer.parseInt(stringBuilder.reverse().toString());
		} catch (NumberFormatException e) {
			return 0;
		}

		return n;

	}

}

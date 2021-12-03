package leetcode;

public class PalindromNumber {

	public static void main(String[] args) {

		System.out.println(isPalindrome(12));

	}

	public static boolean isPalindrome(int x) {

		StringBuilder stringBuilder = new StringBuilder(Integer.toString(x));
		return stringBuilder.toString().equals(stringBuilder.reverse().toString());

	}

}

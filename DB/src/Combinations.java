public class Combinations {

	private static void makeCombinations(String str, String toPrint) {
		
		if (str.length() == 0) {
			System.out.println(toPrint);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);

			String tailString = str.substring(0, i) + str.substring(i+1);
			
			makeCombinations(tailString, toPrint+temp);

		}


	}

	public static void main(String[] args) {

		String originalString = "abc";
		
		makeCombinations(originalString, "");
		

		

	}

}

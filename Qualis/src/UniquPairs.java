import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniquPairs {

	public static void main(String[] args) {

		// [5,0,3-1,6,2,7,1,3,9,2,4] sum = 6

		int[] temp = { 5, 0, 3, - 1, 6, 2, 7, 1, 3, 9, 2, 4 };

		int start = 0;
		int end = temp.length - 1;

		Map<Integer, Integer> map = new HashMap<>();
		
		  for (int i = 0; i < temp.length; i++) {
			
			  for (int j = 0; j < temp.length; j++) {
				if (temp[i] + temp[j] == 6 ) {
					System.out.println(temp[i] + " " + temp[j]);
				}
			}
		  }
			  
			  
		  
		


	}

}

package main;

public class MinimumMoves {

	public static void main(String[] args) {
		
		System.out.println("1");

	}
	
	public static int minMoves(int[] data) {
	    int minOperations = 0;
	    for(int i = 0, j = 0; i < data.length; i = j) {
	        while (j < data.length && data[i] == data[j]) j++;
	        int frequency = j - i;
	        minOperations += Math.min(Math.abs(data[i] - frequency), frequency);
	    }
	    return minOperations;
	}


}

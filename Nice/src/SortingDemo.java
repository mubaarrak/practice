public class SortingDemo {

	public static void main(String[] args) {

		int number = 10;

		int spaces = number - 1;

		for (int i = 0; i <= number; i++) {

			for (int j = 0; j <= spaces; j++) {

				System.out.print(" ");

			}
			spaces--;

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");

			}

			System.out.println();

		}
		
		spaces=0;
		
		for (int i = 0; i <= number -1; i++) {
			
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
				
			}
			spaces++;
			for (int j = 0; j <= 2*(number-i)-1 ; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}
		
		

	}

}

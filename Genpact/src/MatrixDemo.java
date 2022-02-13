
public class MatrixDemo {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };

		long sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (i == j) {
					sum += matrix[i][j];

				}

			}
		}

		System.out.println(sum);

	}

}

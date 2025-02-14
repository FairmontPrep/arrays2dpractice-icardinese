public class Array
{

	// Array should be of format
	// 1 2 3
	// 4 5 6
	// 7 8 9
	public int[][] getRowMajorSquare(int x)
	{
		int count = 1;
		int[][] arr = new int[x][x];
		for (int row = 0; row < x; row++) {
			for (int col = 0; col < x; col++) {
				arr[row][col] = count;
				count++;
			}
		}
		return arr;
	}

	// Array should be of format
	// 1 4 7
	// 2 5 8
	// 3 6 9
	public int[][] getColumnMajorSquare(int x)
	{
		int count = 1;
		int[][] arr = new int[x][x];
		for (int row = 0; row < x; row++) {
			for (int col = 0; col < x; col++) {
				arr[col][row] = count;
				count++;
			}
		}
		return arr;
	}

	// Array should be of format
	// 1 2 3 4
	// 5 6 7 8
	// 9 10 11 12
	public int[][] getRowMajorRectangle(int row, int column)
	{
		int count = 1;
		int[][] arr = new int[row][column];
		for (int currRow = 0; currRow < row; currRow++) {
			for (int currCol = 0; currCol < column; currCol++) {
				arr[currRow][currCol] = count;
				count++;
			}
		}
		return arr;
	}

	// Array should be of format
	// 1 4 7 10
	// 2 5 8 11
	// 3 6 9 12
	public int[][] getColumnMajorRectangle(int column, int row)
	{
		int count = 1;
		int[][] arr = new int[row][column];
		for (int currRow = 0; currRow < row; currRow++) {
			int count2 = count;
			for (int currCol = 0; currCol < column; currCol++) {
				arr[currRow][currCol] = count2;
				count2 += row;
			}
			count++;
		}
		return arr;
	}

	// Please note that each digit occupies two spaces and there is a space between
	// them.
	// You are not required to deal with three digit numbers.
	public void printDouble(int[][] a)
    {
		for (int[] rows : a) {
			for (int cols : rows) {
				if (cols < 10) {
					System.out.print(" " + cols + " ");
				}
				else {
					System.out.print(cols + " ");
				}
			}
			System.out.println();
		}
	}
}
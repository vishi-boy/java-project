package mycode;

public class matrixmul {
	public static void main(String[] args) {
		System.out.println("The program is done by Vishal gupta");
		int row1,row2,col1,col2;
		row1 = 2;
		row2 = 3;
		col1 = 3;
		col2 = 2;
		int[][] firstmatrix = {
				{3,6,5},{3,1,3}
		};
		int[][]secondmatrix = {
				{6,7},{7,8},{9,8}
		};
		int[][]product = new int[row1][col2];
		for (int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				for(int k=0;k<col1;k++) {
					product[i][j]+=firstmatrix[i][k]*secondmatrix[k][j];
				}
			}
		}
		System.out.println("Multiplication of two matrices is: ");
		for (int[] row : product) {
			for(int column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}

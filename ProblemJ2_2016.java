import java.util.Scanner;

public class ProblemJ2_2016 {
	
	public static void main (String[] args) {
		Scanner thing = new Scanner(System.in);
		
		int MagicArray[][] = new int[4][4];
		int RowSum[] = new int[4];
		int ColSum[] = new int[4];
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				MagicArray[i][j] = thing.nextInt();
				RowSum[i] = RowSum[i] + MagicArray[i][j];
				ColSum[j] = ColSum[j] + MagicArray[i][j];
			} 
		}
		
		/**for(int j = 0; j < 4; j++){
			for(int i = 0; i < 4; i++){
				ColSum[j] = ColSum[j] + MagicArray[i][j];
			}
		}
		*/

		if (RowSum[0] == RowSum[1] && RowSum[0] == RowSum[2] && RowSum[0] == RowSum[3] && RowSum[0] == ColSum[0] &&
				RowSum[0] == ColSum[1] && RowSum[0] == ColSum[2] && RowSum[0] == ColSum[3]) {
			System.out.println("Magic");
		}else
			System.out.println("Not magic");
	}
}

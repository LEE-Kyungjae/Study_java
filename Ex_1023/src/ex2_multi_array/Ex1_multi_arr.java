package ex2_multi_array;

public class Ex1_multi_arr {
	public static void main(String[] args) {
		
		//다차원 배열
		//1차원 배열이 2개 모이면 2차원 배열
		//1차원 배열이 3개 모이면 3차원 배열...
		
		//new int[1차원 배열의 수][각 1차원 배열의 index수];
		//new int[큰 방][작은 방];
		int[][] test = new int[2][3];
		
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		
		//System.out.println(test[1][1]);
		
		for( int i = 0; i < test.length; i++ ) {
			
			for( int j = 0; j < test[i].length; j++) {
				
				System.out.print(test[i][j] + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}





















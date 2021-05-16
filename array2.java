package Hello;

public class array2 {

	public static void main(String[] args) {
		//5행 5열의 2차원 배열을 선언하고 각 요소에 1부터 1씩 증가한 값을 설정하되 각 행의 맨 끝과 각 열의 맨끝에
		//합이 누적이 되도록 한다
		//모든 배열의 요소를 출력한다.
		int[][] array = new int [5][5];
		int sum = 1;

		for(int i = 0; i < array.length; i++) {
		for(int j = 0; j < array.length; j++) {
			array[i][j] = sum; 
			sum++;
			
			 array[i][4] = array[i][4] + array[i][j];
             array[4][j] = array[4][j] + array[i][j];
             array[4][4] = array[4][4] + array[i][j];
             
			}
			}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}

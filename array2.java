package Hello;

public class array2 {

	public static void main(String[] args) {
		//5�� 5���� 2���� �迭�� �����ϰ� �� ��ҿ� 1���� 1�� ������ ���� �����ϵ� �� ���� �� ���� �� ���� �ǳ���
		//���� ������ �ǵ��� �Ѵ�
		//��� �迭�� ��Ҹ� ����Ѵ�.
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

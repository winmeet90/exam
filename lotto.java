
public class lotto {

	public static void main(String[] args) {
		// �ζ� ��÷�� �����.
		//1. �ζǴ� 6�ڸ��� ���� ����.
		//2. 1~45������ ������ ���ڰ� �ߺ����� �ʰ� ����.
		
		int[] lottoTarget = new int[6];
		int rn;
		
		for(int i = 0; i<lottoTarget.length; i++) {
			rn = (int)((Math.random()*45)+1);
			lottoTarget[i] = rn;
			for(int j = 0; j<i; j++) {
				if(lottoTarget[i] == lottoTarget[j]) {
					i--;
				}
			}
		}
		for(int i =0; i<lottoTarget.length; i++) {
			System.out.println(lottoTarget[i]);
		}

	}	
}		


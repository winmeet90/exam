
public class lotto {

	public static void main(String[] args) {
		// 로또 추첨기 만들기.
		//1. 로또는 6자리의 수가 들어간다.
		//2. 1~45까지의 랜덤한 숫자가 중복되지 않게 들어간다.
		
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


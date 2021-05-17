public class lotto {

	public static void main(String[] args) {
		//번호가 저장될 배열만들기
		//번호생성(랜덤번호)
		//중복 파악 후 저장
		//출력
		
		int nNumber;
		int[] arLotto = new int[6]; // 랜덤값이 저장될 배열
		int pos = 0;
		
		boolean isExist = false;
		
		//2. 번호 생성
		while(pos < arLotto.length)
		{
			nNumber = (int)(Math.random() * 45) +1; // 1~45
			
			for(int i = 0; i < 6; i++)
			{
				//이미 그 번호가 존재함.
				if(nNumber == arLotto[i])
				{
					isExist = true;
					break;
				}
			//3. 존재하지 않는 번호라면 배열에 저장, pos++;	
			}
			if (isExist == false)
			{
				// 테이블에 저장
				arLotto[pos] = nNumber;
				pos++;
			}
			else
			{
				isExist = true;
			}
		}
		for(int i = 0; i < arLotto.length; i++)
		{
			System.out.println(arLotto[i]);
		}
	}	
}		

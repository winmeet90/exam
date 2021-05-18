public class Lotto
{
	int[] marNumber = new int[6]; // 추상화
	// 필요한 데이터 값
	
	Lotto() // 생성자
	{
		//추가적인 코드는 여기에 작성.
	}
	// 로또 번호를 생성하는 메소드
	boolean genLottoNumber()
	{
		int nNumber;
		boolean isExist = false;
		int pos = 0;
		while(pos < marNumber.length)
		{
			nNumber = (int)(Math.random() * 45) +1; // 1~45
			
			for(int i = 0; i < 6; i++)
			{
				//이미 그 번호가 존재함.
				if(nNumber == marNumber[i])
				{
					isExist = true;
					break;
				}
			//3. 존재하지 않는 번호라면 배열에 저장, pos++;	
			}
			if (isExist == false)
			{
				// 테이블에 저장
				marNumber[pos] = nNumber;
				pos++;
			}
			else
			{
				isExist = true;
			}
		}
		return true;
	}
	// 로또 번호를 복사하는 메소드
	void getNumber(int[] arTarget)
	{
		for(int i=0; i<marNumber.length; i++)
		{
			arTarget[i] = this.marNumber[i];
		}
	}
	
}

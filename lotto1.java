
public class lotto1 {

	public static void main(String[]args)
	{
		Lotto3 lo = new Lotto3();
		
		int[] arLotto = new int [6];
		
		boolean result = lo.genLottoNumber();
		
			if(result == false)
				System.out.println("��ȣ ���� ����.");
			else
				System.out.println("��ȣ ���� ����");
		
	
		lo.getNumber(arLotto);
		
		for(int i = 0; i<6; i++)
		{
			System.out.println(arLotto[i]);
		}
		
	}
	
} 

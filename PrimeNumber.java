package Hello;

public class PrimeNumber {

	public static void main(String[] args) {
	
	//Ư���� ���� �Է��ϸ� �Ҽ��� ���
	//�Ҽ��� �������� 1�� ������ ���� ������ �������� �ʴ� ��
	//������ �������� �������� %2 = 0�� �Ǿ����
		
		int value = 9;
		int div = 2;
		boolean IsPN = true;
		
		for(int i=0; i<value-2; i++) {
			if(value%div == 0) {
				IsPN = false;
				break;
			}
			div++;
		}
	    if(IsPN) {
	    	System.out.println("�Ҽ�");
	    }
	    else {
	    	System.out.println("�ռ���");
	    }      	
	}

}

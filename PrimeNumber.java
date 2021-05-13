package Hello;

public class PrimeNumber {

	public static void main(String[] args) {
	
	//특정한 값을 입력하면 소수를 출력
	//소수는 지정수와 1을 제외한 수로 나누어 떨어지지 않는 수
	//나누어 떨어지지 않으려면 %2 = 0이 되어야함
		
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
	    	System.out.println("소수");
	    }
	    else {
	    	System.out.println("합성수");
	    }      	
	}

}

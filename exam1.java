
public class exam1 {

	public static void main(String[] args) {
		
		Highschool h1 = new LA("ȫ�浿", 1, 11);
		Highschool h2 = new NC("�谳��", 1, 12);
		Highschool h3 = new EaS("��ü��", 1, 13);
		
		h3.subjectCall();
		System.out.println("/ "+h3.mName+" "+h3.mYear+" "+h3.mNumber);
		h1.subjectCall();
		System.out.println("/ "+h1.mName+" "+h1.mYear+" "+h1.mNumber);
		h2.subjectCall();
		System.out.println("/ "+h2.mName+" "+h2.mYear+" "+h2.mNumber);
		
	}
	

}


public class classexam2 {

	public static void main(String[] args) {
		
		classExam s1 = new classExam();
		classExam s2 = new classExam("choi", 3, 10);
		classExam s3 = new classExam();
		
		System.out.println(s1.mName);
		System.out.println(s1.mGrade);
		System.out.println(s1.mNumber);
		
		s1.mName = "Jeong";
		s1.mGrade = 1;
		s1.mNumber = 2;
		
		System.out.println(s1.mName);
		System.out.println(s1.mGrade);
		System.out.println(s1.mNumber);
		
		System.out.println(s2.mName);
		System.out.println(s2.mGrade);
		System.out.println(s2.mNumber);
		
		System.out.println(s3.mName);
		s3.setName("You");
		System.out.println(s3.getName());
	}	
}
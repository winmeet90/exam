
public class classExam {

			//이름
			String mName;
			//학년
			int mGrade;
			//번호
			int mNumber;
			
			//객체의 초기화를 위해 클래스가 인스턴스화 될때 호출되는 함수
			classExam()
			{
				mName = "noname";
				mGrade = 1;
				mNumber = 0;
			}
			//오버로딩 된 생성자
			classExam(String name, int grade, int number)
			{
				mName = name;
				mGrade = grade;
				mNumber = number;
			}
			
			void setName(String name)
			{
				this.mName = name;
				
			}
			
			String getName()
			{
				return mName;
			}
}

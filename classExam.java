
public class classExam {

			//�̸�
			String mName;
			//�г�
			int mGrade;
			//��ȣ
			int mNumber;
			
			//��ü�� �ʱ�ȭ�� ���� Ŭ������ �ν��Ͻ�ȭ �ɶ� ȣ��Ǵ� �Լ�
			classExam()
			{
				mName = "noname";
				mGrade = 1;
				mNumber = 0;
			}
			//�����ε� �� ������
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

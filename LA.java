
public class LA extends Highschool 
{
	String[] subject = new String[] {"국어","영어","수1","국사"};
	
	LA(String name,int year,int number)
	{
		mName = name;
		mYear = year;
		mNumber = number;
	}
	public void subjectCall()
	{
		for(int i=0; i<subject.length; i++)
		{
			System.out.print(subject[i]+" ");
		}
	}
}

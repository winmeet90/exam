
public class EaS extends Highschool
{
	String[] subject = new String[] {"����","����","��1","����"};
	
	EaS(String name,int year,int number)
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
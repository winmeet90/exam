
public class NC extends Highschool
{
	String[] mSubject = new String[] {"����","����","��1","��2"};
	
	NC(String name,int year,int number)
	{
		mName = name;
		mYear = year;
		mNumber = number;
	}
	public void subjectCall()
	{
		for(int i=0; i<mSubject.length; i++)
		{
			System.out.print(mSubject[i]+" ");
		}
	}
}

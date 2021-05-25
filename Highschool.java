
public class Highschool 
{

	String mName;
	int mYear;
	String[] Subject;
	int mNumber;
	
	Highschool()
	{
	  mName = "Default";
	  mYear = 1;
	  mNumber = 0;
	}
	Highschool(String name,int year,int number)
	{
		mName = name;
		mYear = year;
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
	public void subjectCall() {
		for(int i=0; i<Subject.length; i++)
		{
			System.out.print(Subject[i]+" ");
		}
		
	}
}

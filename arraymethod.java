import java.util.Arrays;
import java.util.Random;

public class test1 
{

	public static void main(String[] args) 
	{
		String[] FolderA = {"myComputer","myDocuments","recycleBin"};
		System.out.println("clone() 메서드 호출");
		
		String[] FolderB = FolderA.clone();
		FolderB[0] = "newFolder";
		
		System.out.println(Arrays.toString(FolderA));
		System.out.println(Arrays.toString(FolderB));
		
		System.out.println("\nSystem.arraycopy() 메서드 호출");
		
		String[] FolderC = new String[FolderA.length];
		System.arraycopy(FolderA, 0, FolderC, 0, 3);
		
		System.out.println(Arrays.toString(FolderC));
		
		System.out.println("\n Arrays.copyof() 메서드 호출");
		String[] FolderD = Arrays.copyOf(FolderA, 3);
				FolderD[0] = "newFolder";
		
		System.out.println(Arrays.toString(FolderD));
		
		System.out.println("\n Arrays.copyOfRange() 메서드 호출");
		String[] FolderE = Arrays.copyOfRange(FolderA, 0, 3);
		System.out.println(Arrays.toString(FolderE));
			
		
	}

}

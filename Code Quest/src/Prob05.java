import java.util.*;
import java.io.*;

public class Prob05 {

	public static void main(String[] args) throws IOException 
	{
	Scanner file = new Scanner( new File("Prob05.in.txt"));
	int all = 0; 
	int[] Array = new int[13];
	while(file.hasNext())
	{
		String bookId = file.nextLine();
		int x = 0;
		if(bookId.contains("-"))
		{
			bookId = bookId.replaceAll("-","");
		}
		
		int counter = 0;
		for(int i = 0; i < bookId.length(); i++)
		{
			String nappa = bookId.substring(i, i+1);
			int goku = Integer.parseInt(nappa);
			Array[counter] = goku;
			counter++; 
		}
		
		for(int i = 0; i < Array.length; i++)
		{
			if(i%2==0|| i ==0)
			{
				all+= Array[i]*1;
			}
			else
			{
				all+=Array[i]*3;
			}
		}
		
		if(all%10==0)
		{
			System.out.println("valid");
		}
		else
		{
			int last = all%10;
			int necesary = 10-last;
			System.out.println(Array[Array.length-1]+necesary);
		}
		}
	}
}
import java.util.*;
import java.io.*;

public class Prob04
	{
	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner(new File("Prob04.in.txt"));
		int nappa = file.nextInt();
		file.nextLine();
		for(int j = 0; j < nappa; j++)
			{
			String goku = file.nextLine();
			String[] original = goku.split(" ");
			for (int i = 0; i < original.length; i++)
				{
				String word = original[i];
				int counter = 0;
				char first= word.charAt(0);

				for (int y = 0; y < original.length -3; y++)
					{
					
					if (first == 'a' || first == 'e'|| first == 'i'|| first == 'o'|| first == 'u')
						{
						
						}

					else
						{
						counter++;
						}
					}
				
				if (counter < 2)
					{
					
					if (first == 'a' || first == 'e'|| first == 'i'|| first == 'o'|| first == 'u')
						{
						System.out.print(word + "yay ");
						} 
					
					else
						{
						System.out.print(word.substring(1,word.length()) + word.substring(0, 1) + "ay ");
						}
					}

				else
					{
					System.out.print(word.substring(counter,word.length()) + word.substring(0, counter) + "ay ");
					}
				}
			System.out.println();
			}
		}
	}
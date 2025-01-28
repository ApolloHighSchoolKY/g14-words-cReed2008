import java.util.List;
import java.util.ArrayList;

public class Word
{
	private String word;
	private static String vowels = "AEIOUaeiou";   //static means only one


	public Word()
	{
		word = "";
	}

	public Word(String newWord)
	{
		word = newWord;
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	public int getNumVowels()
	{
		int count = 0;

		//Loop for every letter in "word"
		for (int i = 0; i < word.length(); i++)
		{
			//Use indexOf to see if the letter is in the string "vowels"
			if(vowels.indexOf(word.charAt(i))>=0)
				count++;
		}

		return count;
	}

	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}
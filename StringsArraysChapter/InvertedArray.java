package StringsArraysChapter;
import java.util.*;

public class InvertedArray{

	public static int[] invert(int[] a)
	{
		//Find out first if array length is even or odd
		boolean isEven = a.length % 2 == 0;
		boolean condition = false;
		
		if (isEven)
		{
			//Loop through elements
			//Get temporary values
			for (int i = 0; i < a.length; i += 2)
			{
				int firstTemp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = firstTemp;
			}
			
		}

		else
		{
			//Same Operation as above
			for (int i = 0; i < a.length - 1; i += 2)
			{
				int firstTemp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = firstTemp;
			}
		}

		System.out.println(Arrays.stream(a).boxed().toList());
		return a;
	}

	public static void main (String args[])
	{
		int[] test = {5, 10, 17, 23, 30, 47, 50};
		System.out.println(invert(test));
	}
}

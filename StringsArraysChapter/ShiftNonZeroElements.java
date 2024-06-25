import java.util.*;


public class ShiftNonZeroElements {

	public static int[] shiftNonZero(int [] a, short dig)
	{

		if (dig == 0)
		{
			//Start scanning from the right
			int p = a.length - 1;

			for (; p >= 0; p--)
			{
				int curr = a[p];
				boolean shiftable = (curr != 0) && (p != a.length - 1);
				if (shiftable) //If current element != 0 and it's not in the edge
				{
					boolean moving = true;
					boolean shifted = false;
					int j = p;
					int pos = 0;

					//Shifting through the Zeroes
					while (moving && (j + 1 <= a.length - 1))
					{
						boolean canShift = a[j + 1] == 0;
						if (canShift)
						{
							shifted = true;
							pos++;
							j++;
						}
						else
						{
							break;
						}
					}

					if (shifted)
					{
						a[p + pos] = curr;
						a[p] = 0;
					}
					
				}
			}
		}

		else //Non zero elements shifted to the left
		{
			//Start scanning from the left
			int p = 0;

			for (; p <= a.length - 1; p++)
			{
				int curr = a[p];
				boolean shiftable = (curr != 0) && (p != 0);
				if (shiftable)
				{
					boolean moving = true;
					boolean shifted = false;
					int j = p;
					int pos = 0;

					//shifting through the zeroes
					while (moving && (j - 1) >= 0)
					{
						boolean canShift = a[j - 1] == 0;
						if (canShift)
						{
							shifted = true;
							pos++;
							j--;
						}	
						else
						{
							break;
						}
					}

					if (shifted)
					{
						a[p - pos] = curr;
						a[p] = 0;
					}
				}
			}
		}
		
		System.out.println(Arrays.stream(a).boxed().toList());
		return a;
	}

	public static void main (String args[])
	{
		int[] test = {12, 0, 2012, 23, 12, 0, 123, 2, 3, 4};
		System.out.println(shiftNonZero(test, (short) 0));
		System.out.println(shiftNonZero(test, (short) 1));
	}
}

import java.util.*;


public class ShiftNonZeroElements {

	public static int[] shiftNonZero(int [] a, boolean isLeft)
	{

		if (!isLeft)
		{
			//Start scanning from the right
			int p = a.length - 1;

			for (; p >= 0; p--)
			{
				int curr = a[p];
				if ((curr != 0) && (p != a.length - 1)) //If current element != 0 and it's not in the edge
				{
					boolean moving = true;
					int j = p;
					int pos = 0;

					//Shifting through the Zeroes
					while (moving && (j + 1 <= a.length - 1))
					{
						boolean canShift = a[j + 1] == 0;
						if (canShift)
						{
							pos++;
							j++;
						}
						else
						{
							break;
						}
					}
					a[p + pos] = curr;
					a[p] = 0;
				}
			}
		}
		
		System.out.println(Arrays.stream(a).boxed().toList());
		return a;
	}

	public static void main (String args[])
	{
		int[] test = {0, 10, 0, 0, 30, 60, 0, 200, 0};
		System.out.println(shiftNonZero(test, false));
	}
}

//{60, 0, 0, 200}

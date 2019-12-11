import java.util.*;

class SSTF
{
	public static void main(String []args)
	{
		System.out.println("Enter Currently Serving Cylinder: ");
		int currenthead;
		int num;
		Scanner take = new Scanner(System.in);
		currenthead = take.nextInt();
		System.out.println("Enter Number of cylinders: ");
		num = take.nextInt();
		int[] values = new int[num];
		int var=0,distance=0,i,n;
		System.out.println("Enter Values Of Cylinders: ");
		for(i=0;i<num;i++) values[i] = take.nextInt();
		int[] done = new int[num+1];
		for(i=0;i<num;i++)
		{
			int r = 10000;
			int s = 0;
			for(n=0;n<num;n++)
			{
				if(Math.abs(values[n] - currenthead) < r)
				{
					if(done[n]==0)
					{
						r = Math.abs(values[n] - currenthead);
						s = n;
					}
				}
			}
			done[s]=1;
			distance += Math.abs(values[s] - currenthead);
			currenthead = values[s];
		}
		System.out.println("Time it takes: "+distance);
	}
}
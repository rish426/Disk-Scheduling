import java.util.*;

class SCAN
{
	public static void main(String []args)
	{
		System.out.println("Enter Currently Serving Cylinder: ");
		int currenthead;
		Scanner sc = new Scanner(System.in);
		currenthead = sc.nextInt();
		System.out.println("Enter the max number of the number line: ");
		int end;
		end = sc.nextInt();
		System.out.println("Enter Number of cylinders: ");
		int n;
		n = sc.nextInt();
		int[] values = new int[n];
		int var=0,distance=0,i,l,f=0;
		System.out.println("Enter Values Of Cylinders: ");
		for(i=0;i<n;i++) values[i] = sc.nextInt();
		int[] done = new int[n+1];
		for(i=0;i<n;i++)
		{
			int r = -1;
			int min = 10000;
			for(l=0;l<n;l++)
			{
				if(f==0)
				{
					if(values[l]>currenthead && min>Math.abs(values[l]-currenthead) && done[l]==0)
					{
						min = Math.abs(values[l] - currenthead);
						r = l;
					}
				}
				
				else if(f==1)
				{
					if(values[l]<=currenthead && min>Math.abs(values[l]-currenthead) && done[l]==0)
					{
						r = l;
						min = Math.abs(values[l]-currenthead);
					}
				}
			}
			if(r==-1)
			{
				if(f==0)
				{
					f=1;
					distance += Math.abs(end - currenthead);
					currenthead = end;
				}
				else 
				{
					f=0;
					distance += Math.abs(0 - currenthead);
					currenthead = 0;
				}
				i--;
				continue;
			}
			done[r] = 1;
			distance += Math.abs(values[r] - currenthead);
			currenthead = values[r];
		}
		System.out.println("Time it takes: "+distance);
	}
}
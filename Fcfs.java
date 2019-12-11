
import java.util.*;

public class Fcfs
{
	public static void main(String []args)
	{
		System.out.println("Enter Currently Serving Cylinder: ");
		int currenthead;
		int num;
		Scanner take = new Scanner(System.in);
		currenthead = take.nextInt();
		System.out.println("Enter Number Of Cylinders: ");
		num = take.nextInt();
		int[] values = new int[num];
		int length=0,distance=0,i;
		System.out.println("Enter Values of Cylinders: ");
		for(i=0;i<num;i++) values[i] = take.nextInt();
		length = currenthead;
		for(i=0;i<num;i++)
		{
			length = Math.abs(length - values[i]);
			distance+=length;
			length = values[i];
		}
		System.out.println("Time it takes: "+distance);
	}
}
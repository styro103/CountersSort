import java.util.Arrays;
import java.util.Scanner;

/*
 * Shaun Mbateng
 * This Program Sorts an Array of Integers in Ascending Order
 * It has a Time Complexity of O(N+M)
 */
public class CountersSort 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); //For Inputs
		Sorter Counters = new Sorter(); //Class That Sorts Array
		int [] arr; //Array to Sort
		int len; //Length of Array
		
		//Enter and Set Array Length
		System.out.print("Enter the Array Length: ");
		len = cin.nextInt();
		arr = new int [len];
		
		//Fill Array
		for (int i=0; i<len; i++)
		{
			System.out.print("Enter Element "+(i+1)+":");
			arr[i] = cin.nextInt();
		}
		
		cin.close(); //No More Inputs Needed
		
		//Print Arrays
		System.out.println();
		System.out.println(String.format("%-20s %s", "Original Array: ", Arrays.toString(arr)));
		arr = Counters.sortArray(arr);
		System.out.println(String.format("%-20s %s", "Sorted Array: ", Arrays.toString(arr)));
	}
}

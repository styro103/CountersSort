/*
 * The Class That Sorts the Array Using an Array of Counters
 * It has a time complexity of O(N+M)
 */
public class Sorter 
{
	public int [] sortArray(int [] A)
	{
		int N = A.length; //Length of Array
		int min = A[0]; //Minimum Value in Array
        int max = A[0]; //Maximum Value in Array
		int t = 0; //For Traversing Array of Counters
        int [] count; //Array of Counters
		
		for (int i=1; i<N; i++) //Loop Through Array, Get Minimum and Max
        {
            if (A[i]<min)
                min = A[i];
            else if (A[i]>max)
                max = A[i];
        }
        
        count = new int[max-min+1]; //Set Size of Counters Array to Range of Elements
		
		for (int i=0; i<N; i++) //Loop through Array A
            count[A[i]-min]++; //Increment Count of Number in Respective Position in Counters Array
		for (int i=0; i<N;) //Sort Array Using Counters
		{
			while (count[t]==0)
				t++;
			for (int j=0; j<count[t]; j++)
				A[i++] = t+min;
			
			t++;
		}
		
		return A; //Return Sorted Array
	}
}
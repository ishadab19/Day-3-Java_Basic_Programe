
public class SortingInAscendingOrder {

	public static void main(String[] args) {
		//initialize array
		int []array = new int[] {7,3,5,8,6,7};
		int temp = 0;
		
		//Print element of orignal array
		System.out.println("Initial Element~  ");
		
		for(int i = 0 ; i < array.length ; i++)
		{
			System.out.println(array[i]+"");
		}
		
		// Now Sorting All arrays in ascending form
		for(int i = 0 ; i <array.length ; i++)
		{
			for(int j = i+1 ; j < array.length ; j++)
			{
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println();
		//element after sorting
		System.out.println("Sorted element in asecending order~ ");
		for(int i = 0 ; i < array.length ; i++)
		{
			System.out.println(array[i] + "");
		}

	}

}

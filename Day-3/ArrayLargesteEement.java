import java.util.Scanner;

public class ArrayLargesteEement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		int max = array[0];
		
		System.out.println("enter " +size+ " Element");
		
		for(int i = 0 ; i < array.length ; i++ ) {
			array[i] = sc.nextInt();
		}
		for(int i = 0 ; i < array.length ; i++ ) {
			if(array[i] > max) {
				max = array[i];
			}
			
		}
		System.out.println("Largest Element: "+max);
		
		
		
	}

}


public class ArrayFrequency {

	public static void main(String[] args) {
		  //Initialize array  
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        //Array fr will store frequencies of element  
        int [] freq = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting  of same element 
                    freq[j] = visited;  
                }  
            }  
            if(freq[i] != visited)  
                freq[i] = count;  
        }  
  
        //Displays the frequency   
          
        System.out.println(" Element : Frequency");  
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != visited)  
                System.out.println("    " + arr[i] + "    :    " + freq[i]);  
        }  
    }}  
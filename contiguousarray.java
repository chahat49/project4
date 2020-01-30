
import java.util.*; 

class Contigousarray { 
public static void subArraySum(int[] arr, int n, int sum) { 
		
	int csum = 0; 
               int start = 0; 
		int end = -1; 
		HashMap<Integer, Integer> hashMap = new HashMap<>(); 
		for (int i = 0; i < n; i++) { 
		csum = csum + arr[i]; 
		 
			//the sub array is starting from index 0- so stop 
			if (csum - sum == 0) { 
				start = 0; 
				end = i; 
				break; 
			} 
			
			// have subarray with the sum 
			if (hashMap.containsKey(cur_sum - sum)) { 
				start = hashMap.get(cur_sum - sum) + 1; 
				end = i; 
				break; 
			} 
			//if value is not present then add 
			hashMap.put(cur_sum, i); 

		} 
		// we have reached end without the sum 
		if (end == -1) { 
			System.out.println(-1); 
		} else { 
			System.out.println(start + "  " + end); 
		} 

	} 

	// Driver code 
	public static void main(String[] args) { 
		 Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     arr[i]=scan.nextInt();
     int sum=scan.nextInt();
		subArraySum(arr, n, sum); 

	} 
} 
